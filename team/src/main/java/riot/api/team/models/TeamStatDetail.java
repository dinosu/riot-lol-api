package riot.api.team.models;

import com.google.gson.annotations.SerializedName;

public class TeamStatDetail {
    @SerializedName("wins")
    private int mWins;
    @SerializedName("losses")
    private int mLosses;
    @SerializedName("averageGamesPlayed")
    private int mAverageGamesPlayed;
    @SerializedName("teamStatType")
    private String mTeamStatType;

    public int getWins() {
        return mWins;
    }

    public int getLosses() {
        return mLosses;
    }

    public int getAverageGamesPlayed() {
        return mAverageGamesPlayed;
    }

    public String getTeamStatType() {
        return mTeamStatType;
    }
}
