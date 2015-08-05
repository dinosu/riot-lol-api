package riot.api;

import com.squareup.okhttp.Request;
import riot.api.common.RequestService;
import riot.api.common.RiotApi;
import riot.api.common.RiotRequestBuilder;
import riot.api.common.utils.StringUtils;
import riot.api.constants.QueueType;
import riot.api.constants.Region;
import riot.api.matchhistory.models.PlayerHistory;

import java.io.IOException;

public class MatchHistoryApi extends RiotApi {
    private final static String VERSION = "2.2";

    public MatchHistoryApi(RequestService requestService) {
        super(requestService);
    }

    private Request getMatchHistoryRequest(Region region, long summonerId, QueueType queueType, int beginIndex, int endIndex, Integer... championIds) {
        String path = "/api/lol/%s/v%s/matchhistory/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion(), summonerId));
        if (queueType != null && queueType != QueueType.UNKNOWN) {
            requestBuilder.addQueryParameter(QueryParameters.CHAMPION_IDS, queueType.name());
        }
        if (beginIndex > -1) {
            requestBuilder.addQueryParameter(QueryParameters.BEGIN_INDEX, String.valueOf(beginIndex));
        }
        if (endIndex > -1) {
            requestBuilder.addQueryParameter(QueryParameters.END_INDEX, String.valueOf(endIndex));
        }
        if (queueType != null) {
            requestBuilder.addQueryParameter(QueryParameters.RANKED_QUEUES, queueType.name());
        }

        if (championIds != null && championIds.length > 0) {
            requestBuilder.addQueryParameter(QueryParameters.CHAMPION_IDS, StringUtils.join(",", championIds));
        }
        return requestBuilder.build();
    }

    public PlayerHistory getMatchHistory(Region region, long summonerId, QueueType queueType, int beginIndex, int endIndex, Integer... championIds) throws IOException {
        return getRequestService().execute(getMatchHistoryRequest(region, summonerId, queueType, beginIndex, endIndex, championIds), PlayerHistory.class);
    }

    public void getMatchHistoryAsync(Region region, long summonerId, QueueType queueType, int beginIndex, int endIndex, Integer... championIds) {
        getRequestService().executeAsync(getMatchHistoryRequest(region, summonerId, queueType, beginIndex, endIndex, championIds), PlayerHistory.class);
    }

    @Override
    public String getVersion() {
        return VERSION;
    }

    private class QueryParameters {
        public final static String CHAMPION_IDS = "championIds";
        public final static String RANKED_QUEUES = "rankedQueues";
        public final static String BEGIN_INDEX = "beginIndex";
        public final static String END_INDEX = "endIndex";
    }
}
