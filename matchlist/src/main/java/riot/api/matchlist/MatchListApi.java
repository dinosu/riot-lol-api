package riot.api.matchlist;

import com.squareup.okhttp.Request;
import riot.api.common.RequestService;
import riot.api.common.RiotApi;
import riot.api.common.RiotRequestBuilder;
import riot.api.common.utils.StringUtils;
import riot.api.constants.QueueType;
import riot.api.constants.Region;
import riot.api.constants.Season;
import riot.api.matchlist.models.MatchList;

import javax.inject.Inject;
import java.io.IOException;

public class MatchListApi extends RiotApi {
    private static final String VERSION = "2.2";

    @Inject
    public MatchListApi(RequestService requestService) {
        super(requestService);
    }

    private Request getMatchListRequest(Region region, long summonerId, QueueType queueType, Long beginTime, Long endTime, Integer beginIndex, Integer endIndex, Season[] seasons, Long... championIds) {
        String path = "/api/lol/%s/v%s/matchlist/by-summoner/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion(), summonerId));
        if (queueType != null) {
            requestBuilder.addQueryParameter(QueryParameters.RANKED_QUEUES, queueType.name());
        }
        if (seasons != null && seasons.length > 0) {
            requestBuilder.addQueryParameter(QueryParameters.SEASONS, StringUtils.join(",", seasons));
        }

        if (championIds != null && championIds.length > 0) {
            requestBuilder.addQueryParameter(QueryParameters.CHAMPION_IDS, StringUtils.join(",", championIds));
        }

        if (beginTime != null) {
            requestBuilder.addQueryParameter(QueryParameters.BEGIN_TIME, String.valueOf(beginTime));
        }

        if (endTime != null) {
            requestBuilder.addQueryParameter(QueryParameters.END_TIME, String.valueOf(endTime));
        }

        if (beginIndex != null) {
            requestBuilder.addQueryParameter(QueryParameters.BEGIN_INDEX, String.valueOf(beginIndex));
        }

        if (endIndex != null) {
            requestBuilder.addQueryParameter(QueryParameters.END_INDEX, String.valueOf(endIndex));
        }

        return requestBuilder.build();
    }

    public MatchList getMatchList(Region region, long summonerId, QueueType queueType, Long beginTime, Long endTime, Integer beginIndex, Integer endIndex, Season[] seasons, Long... championIds) throws IOException {
        return getRequestService().execute(getMatchListRequest(region, summonerId, queueType, beginTime, endTime, beginIndex, endIndex, seasons, championIds), MatchList.class);
    }

    public void getMatchListAsync(Region region, long summonerId, QueueType queueType, Long beginTime, Long endTime, Integer beginIndex, Integer endIndex, Season[] seasons, Long... championIds) {
        getRequestService().executeAsync(getMatchListRequest(region, summonerId, queueType, beginTime, endTime, beginIndex, endIndex, seasons, championIds), MatchList.class);
    }

    @Override
    public String getVersion() {
        return VERSION;
    }

    private class QueryParameters {
        public final static String CHAMPION_IDS = "championIds";
        public final static String RANKED_QUEUES = "rankedQueues";
        public final static String SEASONS = "seasons";
        public final static String BEGIN_TIME = "beginTime";
        public final static String END_TIME = "endTime";
        public final static String BEGIN_INDEX = "beginIndex";
        public final static String END_INDEX = "endIndex";
    }
}
