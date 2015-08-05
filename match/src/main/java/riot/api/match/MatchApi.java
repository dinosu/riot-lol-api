package riot.api.match;

import com.squareup.okhttp.Request;
import riot.api.common.RequestService;
import riot.api.common.RiotApi;
import riot.api.common.RiotRequestBuilder;
import riot.api.constants.Region;
import riot.api.match.models.MatchDetail;

import java.io.IOException;

public class MatchApi extends RiotApi {
    private final static String VERSION = "2.2";

    public MatchApi(RequestService requestService) {
        super(requestService);
    }

    private Request getMatchRequest(Region region, long id, boolean includeTimeline) {
        String path = "/api/lol/%s/v%s/match/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion(), id));
        requestBuilder.addQueryParameter(QueryParameters.INCLUDE_TIMELINE, String.valueOf(includeTimeline));
        return requestBuilder.build();
    }

    public MatchDetail getMatch(Region region, long id, boolean includeTimeline) throws IOException {
        return getRequestService().execute(getMatchRequest(region, id, includeTimeline), MatchDetail.class);
    }

    public void getMatchAsync(Region region, long id, boolean includeTimeline) {
        getRequestService().executeAsync(getMatchRequest(region, id, includeTimeline), MatchDetail.class);
    }

    @Override
    public String getVersion() {
        return null;
    }

    private class QueryParameters {
        public final static String INCLUDE_TIMELINE = "includeTimeline";
    }
}
