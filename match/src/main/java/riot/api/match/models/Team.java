package riot.api.match.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Team {
    @SerializedName("bans")
    private List<BannedChampion> mBans;
    @SerializedName("baronKills")
    private int mBaronKills;
    @SerializedName("dragonKills")
    private int mDragonKills;
    @SerializedName("inhibitorKills")
    private int mInhibitorKills;
    @SerializedName("teamId")
    private int mTeamId;
    @SerializedName("towerKills")
    private int mTowerKills;
    @SerializedName("vilemawKills")
    private int mVilemawKills;
    @SerializedName("firstBaron")
    private boolean mFirstBaron;
    @SerializedName("firstBlood")
    private boolean mFirstBlood;
    @SerializedName("firstDragon")
    private boolean mFirstDragon;
    @SerializedName("firstInhibitor")
    private boolean mFirstInhibitor;
    @SerializedName("firstTower")
    private boolean mFirstTower;
    @SerializedName("winner")
    private boolean mWinner;
    @SerializedName("dominionVictoryScore")
    private long mDominionVictoryScore;

    public List<BannedChampion> getBans() {
        return mBans;
    }

    public int getBaronKills() {
        return mBaronKills;
    }

    public int getDragonKills() {
        return mDragonKills;
    }

    public int getInhibitorKills() {
        return mInhibitorKills;
    }

    public int getTeamId() {
        return mTeamId;
    }

    public int getTowerKills() {
        return mTowerKills;
    }

    public int getVilemawKills() {
        return mVilemawKills;
    }

    public boolean isFirstBaron() {
        return mFirstBaron;
    }

    public boolean isFirstBlood() {
        return mFirstBlood;
    }

    public boolean isFirstDragon() {
        return mFirstDragon;
    }

    public boolean isFirstInhibitor() {
        return mFirstInhibitor;
    }

    public boolean isFirstTower() {
        return mFirstTower;
    }

    public boolean isWinner() {
        return mWinner;
    }

    public long getDominionVictoryScore() {
        return mDominionVictoryScore;
    }
}
