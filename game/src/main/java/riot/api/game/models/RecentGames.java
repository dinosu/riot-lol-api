package riot.api.game.models;

import com.google.gson.annotations.SerializedName;

import java.util.Set;

public class RecentGames {
    @SerializedName("games")
    private Set<Game> mGames;
    @SerializedName("summonerId")
    private long mSummonerId;

    public Set<Game> getGames() {
        return mGames;
    }

    public long getSummonerId() {
        return mSummonerId;
    }
}
