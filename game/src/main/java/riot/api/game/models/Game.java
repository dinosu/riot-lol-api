package riot.api.game.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Game {
    @SerializedName("championId")
    private int mChampionId;
    @SerializedName("ipEarned")
    private int mIpEarned;
    @SerializedName("level")
    private int mLevel;
    @SerializedName("mapId")
    private int mMapId;
    @SerializedName("spell1")
    private int mSummonerSpell1;
    @SerializedName("spell2")
    private int mSummonerSpell2;
    @SerializedName("teamId")
    private int mTeamId;
    @SerializedName("createDate")
    private long mCreateDate;
    @SerializedName("gameId")
    private long mGameId;
    @SerializedName("fellowPlayers")
    private List<Player> mFellowPlayers;
    @SerializedName("gameMode")
    private String mGameMode;
    @SerializedName("gameType")
    private String mGameType;
    @SerializedName("subType")
    private String mSubType;
    @SerializedName("invalid")
    private boolean mInvalid;
    @SerializedName("stats")
    private RawStats mStats;

    public int getChampionId() {
        return mChampionId;
    }

    public int getIpEarned() {
        return mIpEarned;
    }

    public int getLevel() {
        return mLevel;
    }

    public int getMapId() {
        return mMapId;
    }

    public int getSummonerSpell1() {
        return mSummonerSpell1;
    }

    public int getSummonerSpell2() {
        return mSummonerSpell2;
    }

    public int getTeamId() {
        return mTeamId;
    }

    public long getCreateDate() {
        return mCreateDate;
    }

    public long getGameId() {
        return mGameId;
    }

    public List<Player> getFellowPlayers() {
        return mFellowPlayers;
    }

    public String getGameMode() {
        return mGameMode;
    }

    public String getGameType() {
        return mGameType;
    }

    public String getSubType() {
        return mSubType;
    }

    public boolean isInvalid() {
        return mInvalid;
    }

    public RawStats getStats() {
        return mStats;
    }
}
