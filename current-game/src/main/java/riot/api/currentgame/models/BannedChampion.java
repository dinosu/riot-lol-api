package riot.api.currentgame.models;

import com.google.gson.annotations.SerializedName;

public class BannedChampion {
    @SerializedName("championId")
    private long mChampionId;
    @SerializedName("teamId")
    private long mTeamId;
    @SerializedName("pickTurn")
    private int mPickTurn;

    public long getChampionId() {
        return mChampionId;
    }

    public long getTeamId() {
        return mTeamId;
    }

    public int getPickTurn() {
        return mPickTurn;
    }
}
