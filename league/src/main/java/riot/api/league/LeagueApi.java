package riot.api.league;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import io.github.andrew_su.eventbus.DumbBus;
import riot.api.common.RequestService;
import riot.api.common.RiotApi;
import riot.api.common.RiotRequestBuilder;
import riot.api.constants.Region;
import riot.api.common.utils.StringUtils;
import riot.api.league.models.LeagueMap;

import javax.inject.Inject;
import java.io.IOException;

public class LeagueApi extends RiotApi {
    private final static String VERSION = "2.5";

    @Inject
    public LeagueApi(RequestService requestService) {
        super(requestService);
    }

    public static void main(String[] args) throws IOException {
        LeagueApi leagueApi = new LeagueApi(new RequestService(new OkHttpClient(), new Gson(), new DumbBus()));
        leagueApi.getLeagueEntryBySummonerIds(Region.NA, 21462988L);
    }

    private Request getLeagueBySummonerIdsRequest(Region region, Long... summonerIds) {
        if (summonerIds == null || summonerIds.length == 0) {
            throw new IllegalArgumentException("at least one summoner id must be provided");
        }
        String path = "/api/lol/%s/v%s/league/by-summoner/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion(), StringUtils.join(",", summonerIds)));
        return requestBuilder.build();
    }

    public LeagueMap getLeagueBySummonerIds(Region region, Long... summonerIds) throws IOException {
        return getRequestService().execute(getLeagueBySummonerIdsRequest(region, summonerIds), LeagueMap.class);
    }

    public void getLeagueBySummonerIdsAsync(Region region, Long... summonerIds) {
        getRequestService().executeAsync(getLeagueBySummonerIdsRequest(region, summonerIds), LeagueMap.class);
    }

    private Request getLeagueEntryBySummonerIdsRequest(Region region, Long... summonerIds) {
        if (summonerIds == null || summonerIds.length == 0) {
            throw new IllegalArgumentException("at least one summoner id must be provided");
        }
        String path = "/api/lol/%s/v%s/league/by-summoner/%s/entry";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion(), StringUtils.join(",", summonerIds)));
        return requestBuilder.build();
    }

    public LeagueMap getLeagueEntryBySummonerIds(Region region, Long... summonerIds) throws IOException {
        return getRequestService().execute(getLeagueEntryBySummonerIdsRequest(region, summonerIds), LeagueMap.class);
    }

    public void getLeagueEntryBySummonerIdsAsync(Region region, Long... summonerIds) {
        getRequestService().executeAsync(getLeagueEntryBySummonerIdsRequest(region, summonerIds), LeagueMap.class);
    }

    private Request getLeagueByTeamIdsRequest(Region region, Long... teamIds) {
        if (teamIds == null || teamIds.length == 0) {
            throw new IllegalArgumentException("at least one summoner id must be provided");
        }
        String path = "/api/lol/%s/v%s/league/by-team/%s";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion(), StringUtils.join(",", teamIds)));
        return requestBuilder.build();
    }

    public LeagueMap getLeagueByTeamIds(Region region, Long... teamIds) throws IOException {
        return getRequestService().execute(getLeagueByTeamIdsRequest(region, teamIds), LeagueMap.class);
    }

    public void getLeagueByTeamIdsAsync(Region region, Long... teamIds) {
        getRequestService().executeAsync(getLeagueByTeamIdsRequest(region, teamIds), LeagueMap.class);
    }

    private Request getLeagueEntryByTeamIdsRequest(Region region, Long... teamIds) {
        if (teamIds == null || teamIds.length == 0) {
            throw new IllegalArgumentException("at least one summoner id must be provided");
        }
        String path = "/api/lol/%s/v%s/league/by-team/%s/entry";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion(), StringUtils.join(",", teamIds)));
        return requestBuilder.build();
    }

    public LeagueMap getLeagueEntryByTeamIds(Region region, Long... teamIds) throws IOException {
        return getRequestService().execute(getLeagueEntryByTeamIdsRequest(region, teamIds), LeagueMap.class);
    }

    public void getLeagueEntryByTeamIdsAsync(Region region, Long... teamIds) {
        getRequestService().executeAsync(getLeagueEntryByTeamIdsRequest(region, teamIds), LeagueMap.class);
    }

    private Request getChallengerLeagueRequest(Region region) {
        String path = "/api/lol/{region}/v%s/league/challenger";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion()));
        return requestBuilder.build();
    }

    public LeagueMap getChallengerLeague(Region region) throws IOException {
        return getRequestService().execute(getChallengerLeagueRequest(region), LeagueMap.class);
    }

    public void getChallengerLeagueAsync(Region region) {
        getRequestService().executeAsync(getChallengerLeagueRequest(region), LeagueMap.class);
    }

    private Request getMasterLeagueRequest(Region region) {
        String path = "/api/lol/{region}/v%s/league/master";
        RiotRequestBuilder requestBuilder = new RiotRequestBuilder(region, String.format(path, region.getRegionId(), getVersion()));
        return requestBuilder.build();
    }

    public LeagueMap getMasterLeague(Region region) throws IOException {
        return getRequestService().execute(getChallengerLeagueRequest(region), LeagueMap.class);
    }

    public void getMasterLeagueAsync(Region region) {
        getRequestService().executeAsync(getMasterLeagueRequest(region), LeagueMap.class);
    }

    public String getVersion() {
        return VERSION;
    }
}
