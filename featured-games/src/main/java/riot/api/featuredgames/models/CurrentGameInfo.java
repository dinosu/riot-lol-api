package riot.api.featuredgames.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CurrentGameInfo {
    @SerializedName("bannedChamions")
    private List<BannedChampion> mBannedChampions;
    @SerializedName("participants")
    private List<Participant> mParticipants;
    @SerializedName("gameMode")
    private String mGameMode;
    @SerializedName("gameType")
    private String mGameType;
    @SerializedName("platformId")
    private String mPlatformId;
    @SerializedName("observers")
    private Observer mObservers;
    @SerializedName("gameId")
    private long mGameId;
    @SerializedName("gameLength")
    private long mGameLength;
    @SerializedName("gameQueueConfigId")
    private long mGameQueueConfigId;
    @SerializedName("gameStartTime")
    private long mGameStartTime;
    @SerializedName("gameTypeConfigId")
    private long mGameTypeConfigId;
    @SerializedName("mapId")
    private long mMapId;
//    @SerializedName("teamInfoOne")
//    private TeamInfo mTeamInfoOne;
//    @SerializedName("teamInfoTwo")
//    private TeamInfo mTeamInfoTwo;

    public List<BannedChampion> getBannedChampions() {
        return mBannedChampions;
    }

    public List<Participant> getParticipants() {
        return mParticipants;
    }

    public String getGameMode() {
        return mGameMode;
    }

    public String getGameType() {
        return mGameType;
    }

    public String getPlatformId() {
        return mPlatformId;
    }

    public Observer getObservers() {
        return mObservers;
    }

    public long getGameId() {
        return mGameId;
    }

    public long getGameLength() {
        return mGameLength;
    }

    public long getGameQueueConfigId() {
        return mGameQueueConfigId;
    }

    public long getGameStartTime() {
        return mGameStartTime;
    }

    public long getGameTypeConfigId() {
        return mGameTypeConfigId;
    }

    public long getMapId() {
        return mMapId;
    }

//    public TeamInfo getTeamInfoOne() {
//        return mTeamInfoOne;
//    }
//
//    public TeamInfo getTeamInfoTwo() {
//        return mTeamInfoTwo;
//    }
}
