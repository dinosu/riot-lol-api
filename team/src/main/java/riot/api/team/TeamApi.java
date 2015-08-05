package riot.api.team;

import riot.api.common.RequestService;
import riot.api.common.RiotApi;

import javax.inject.Inject;

public class TeamApi extends RiotApi {
    private static final String VERSION = "2.4";
    @Inject
    public TeamApi(RequestService requestService) {
        super(requestService);
    }

    @Override
    public String getVersion() {
        return null;
    }
}
