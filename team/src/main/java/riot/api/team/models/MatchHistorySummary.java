package riot.api.team.models;

import com.google.gson.annotations.SerializedName;

public class MatchHistorySummary {
    @SerializedName("assists")
    private int mAssists;
    @SerializedName("deaths")
    private int mDeaths;
    @SerializedName("kills")
    private int mKills;
    @SerializedName("mapId")
    private int mMapId;
    @SerializedName("opposingTeamKills")
    private int mOpposingTeamKills;
    @SerializedName("gameMode")
    private String mGameMode;
    @SerializedName("opposingTeamName")
    private String mOpposingTeamName;
    @SerializedName("invalid")
    private boolean mInvalid;
    @SerializedName("win")
    private boolean mWin;
    @SerializedName("gameId")
    private long mGameId;
    @SerializedName("date")
    private long mDate;

    public int getAssists() {
        return mAssists;
    }

    public int getDeaths() {
        return mDeaths;
    }

    public int getKills() {
        return mKills;
    }

    public int getMapId() {
        return mMapId;
    }

    public int getOpposingTeamKills() {
        return mOpposingTeamKills;
    }

    public String getGameMode() {
        return mGameMode;
    }

    public String getOpposingTeamName() {
        return mOpposingTeamName;
    }

    public boolean isInvalid() {
        return mInvalid;
    }

    public boolean isWin() {
        return mWin;
    }

    public long getGameId() {
        return mGameId;
    }

    public long getDate() {
        return mDate;
    }
}
