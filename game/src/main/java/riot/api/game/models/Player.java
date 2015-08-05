package riot.api.game.models;

import com.google.gson.annotations.SerializedName;

public class Player {
    @SerializedName("championId")
    private int mChampionId;
    @SerializedName("teamId")
    private int mTeamId;
    @SerializedName("summonerId")
    private long mSummonerId;

    public int getChampionId() {
        return mChampionId;
    }

    public int getTeamId() {
        return mTeamId;
    }

    public long getSummonerId() {
        return mSummonerId;
    }
}
