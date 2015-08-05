package riot.api.currentgame;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import io.github.andrew_su.eventbus.DumbBus;
import riot.api.common.RequestService;
import riot.api.common.RiotApi;
import riot.api.common.RiotRequestBuilder;
import riot.api.constants.Region;
import riot.api.currentgame.models.CurrentGameInfo;

import javax.inject.Inject;
import java.io.IOException;

public class CurrentGameApi extends RiotApi {
    private final static String VERSION = "1.0";

    @Inject
    public CurrentGameApi(RequestService requestService) {
        super(requestService);
    }

    public static void main(String[] args) throws IOException {
        CurrentGameApi currentGameApi = new CurrentGameApi(new RequestService(new OkHttpClient(), new Gson(), new DumbBus()));
        currentGameApi.getCurrentGame(Region.NA, 21462988L);
    }

    private Request getCurrentGameRequest(Region region, long summonerId) {
        // /observer-mode/rest/consumer/getSpectatorGameInfo/{platformId}/{summonerId}
        String path = "/observer-mode/rest/consumer/getSpectatorGameInfo/%s/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getPlatformId(), summonerId));
        return requestBuilder.build();
    }

    public CurrentGameInfo getCurrentGame(Region region, long summonerId) throws IOException {
        return getRequestService().execute(getCurrentGameRequest(region, summonerId), CurrentGameInfo.class);
    }

    public void getCurrentGameAsync(Region region, long summonerId) {
        getRequestService().executeAsync(getCurrentGameRequest(region, summonerId), CurrentGameInfo.class);
    }

    public String getVersion() {
        return VERSION;
    }
}
