package riot.api.featuredgames.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FeaturedGames {
    @SerializedName("clientRefreshInterval")
    private long mClientRefreshInterval;
    @SerializedName("gameList")
    private List<FeaturedGames> mGameList;

    public long getClientRefreshInterval() {
        return mClientRefreshInterval;
    }

    public List<FeaturedGames> getGameList() {
        return mGameList;
    }
}
