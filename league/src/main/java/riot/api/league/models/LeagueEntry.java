package riot.api.league.models;

import com.google.gson.annotations.SerializedName;

public class LeagueEntry {
    @SerializedName("division")
    private String mDivision;
    @SerializedName("playerOrTeamId")
    private String mPlayerOrTeamId;
    @SerializedName("playerOrTeamName")
    private String mPlayerOrTeamName;
    @SerializedName("isFreshBlood")
    private boolean mFreshBlood;
    @SerializedName("isHotStreak")
    private boolean mHotStreak;
    @SerializedName("isInactive")
    private boolean mInactive;
    @SerializedName("isVeteran")
    private boolean mVeteran;
    @SerializedName("leaguePoints")
    private int mLeaguePoints;
    @SerializedName("wins")
    private int mWins;
    @SerializedName("losses")
    private int mLosses;
    @SerializedName("miniSeries")
    private MiniSeries mMiniSeries;

    public String getDivision() {
        return mDivision;
    }

    public String getPlayerOrTeamId() {
        return mPlayerOrTeamId;
    }

    public String getPlayerOrTeamName() {
        return mPlayerOrTeamName;
    }

    public boolean isFreshBlood() {
        return mFreshBlood;
    }

    public boolean isHotStreak() {
        return mHotStreak;
    }

    public boolean isInactive() {
        return mInactive;
    }

    public boolean isVeteran() {
        return mVeteran;
    }

    public int getLeaguePoints() {
        return mLeaguePoints;
    }

    public int getWins() {
        return mWins;
    }

    public int getLosses() {
        return mLosses;
    }

    public MiniSeries getMiniSeries() {
        return mMiniSeries;
    }
}
