package riot.api;

import com.squareup.okhttp.Request;
import riot.api.common.RequestService;
import riot.api.common.RiotApi;
import riot.api.common.RiotRequestBuilder;
import riot.api.constants.Region;
import riot.api.game.models.Game;

import java.io.IOException;

public class GameApi extends RiotApi {
    private final static String VERSION = "1.3";

    public GameApi(RequestService requestService) {
        super(requestService);
    }

    private Request getGameRequest(Region region, long summonerId) {
        //             /api/lol/{region}/v{version}/game/by-summoner/{summonerId}/recent
        String path = "/api/lol/%s/v%s/game/by-summoner/%s/recent";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion(), summonerId));
        return requestBuilder.build();
    }

    public Game getGame(Region region, long summonerId) throws IOException {
        return getRequestService().execute(getGameRequest(region, summonerId), Game.class);
    }

    public void getGameAsync(Region region, long summonerId) {
        getRequestService().executeAsync(getGameRequest(region, summonerId), Game.class);
    }

    @Override
    public String getVersion() {
        return VERSION;
    }
}
