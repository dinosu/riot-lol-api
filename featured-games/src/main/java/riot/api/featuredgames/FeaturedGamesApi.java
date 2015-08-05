package riot.api.featuredgames;

import com.squareup.okhttp.Request;
import riot.api.common.RequestService;
import riot.api.common.RiotApi;
import riot.api.common.RiotRequestBuilder;
import riot.api.constants.Region;
import riot.api.featuredgames.models.FeaturedGames;

import javax.inject.Inject;
import java.io.IOException;

public class FeaturedGamesApi extends RiotApi {
    private final static String VERSION = "1.0";

    @Inject
    public FeaturedGamesApi(RequestService requestService) {
        super(requestService);
    }

    private Request getFeaturedGamesRequest(Region region) {
        String path = "/observer-mode/rest/featured";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, path);
        return requestBuilder.build();
    }

    public FeaturedGames getFeaturedGames(Region region) throws IOException {
        return getRequestService().execute(getFeaturedGamesRequest(region), FeaturedGames.class);
    }

    public void getFeaturedGamesAsync(Region region) {
        getRequestService().executeAsync(getFeaturedGamesRequest(region), FeaturedGames.class);
    }

    @Override
    public String getVersion() {
        return VERSION;
    }
}
