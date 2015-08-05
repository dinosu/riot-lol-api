package riot.api.lolstatus;

import com.squareup.okhttp.Request;
import riot.api.common.RequestService;
import riot.api.common.RiotApi;
import riot.api.constants.Region;
import riot.api.lolstatus.models.ShardList;
import riot.api.lolstatus.models.ShardStatus;

import java.io.IOException;

public class StatusApi extends RiotApi {
    private final static String VERSION = "1.0";

    public StatusApi(RequestService requestService) {
        super(requestService);
    }

    private Request getShardRequest() {
        Request.Builder builder = new Request.Builder();
        builder.url("http://status.leagueoflegends.com/shards");
        return builder.build();
    }

    public ShardList getShards() throws IOException {
        return getRequestService().execute(getShardRequest(), ShardList.class);
    }

    public void getShardAsync() {
        getRequestService().executeAsync(getShardRequest(), ShardList.class);
    }

    private Request getShardStatusRequest(Region region) {
        Request.Builder builder = new Request.Builder();
        builder.url(String.format("http://status.leagueoflegends.com/shards/%s", region.getRegionId()));
        return builder.build();
    }

    public ShardStatus getShardStatus(Region region) throws IOException {
        return getRequestService().execute(getShardStatusRequest(region), ShardStatus.class);
    }

    public void getShardStatusAsync(Region region) {
        getRequestService().executeAsync(getShardStatusRequest(region), ShardStatus.class);
    }

    @Override
    public String getVersion() {
        return VERSION;
    }
}
