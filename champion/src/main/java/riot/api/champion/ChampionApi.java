package riot.api.champion;

import com.squareup.okhttp.Request;
import riot.api.champion.models.Champion;
import riot.api.champion.models.ChampionList;
import riot.api.common.RequestService;
import riot.api.common.RiotApi;
import riot.api.common.RiotRequestBuilder;
import riot.api.constants.Region;

import javax.inject.Inject;
import java.io.IOException;

public class ChampionApi extends RiotApi {
    private final static String VERSION = "1.2";

    @Inject
    public ChampionApi(RequestService requestService) {
        super(requestService);
    }

    private Request getChampionsRequest(Region region, boolean freeToPlay) {
        String path = "/api/lol/%s/v%s/champion";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion()));
        requestBuilder.addQueryParameter(QueryParameters.FREE_TO_PLAY, String.valueOf(freeToPlay));
        return requestBuilder.build();
    }

    public ChampionList getChampions(Region region, boolean freeToPlay) throws IOException {
        return getRequestService().execute(getChampionsRequest(region, freeToPlay), ChampionList.class);
    }

    public void getChampionsAsync(Region region, boolean freeToPlay) {
        getRequestService().executeAsync(getChampionsRequest(region, freeToPlay), ChampionList.class);
    }

    public Request getChampionRequest(Region region, int id) throws IOException {
        String path = "/api/lol/%s/v%s/champion/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion(), id));
        return requestBuilder.build();
    }

    public Champion getChampion(Region region, int id) throws IOException {
        return getRequestService().execute(getChampionRequest(region, id), Champion.class);
    }

    public void getChampionAsync(Region region, int id) throws IOException {
        getRequestService().executeAsync(getChampionRequest(region, id), Champion.class);
    }

    public String getVersion() {
        return VERSION;
    }

    private class QueryParameters {
        public final static String FREE_TO_PLAY = "freeToPlay";
    }
}
