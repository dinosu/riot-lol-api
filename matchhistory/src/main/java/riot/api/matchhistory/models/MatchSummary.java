package riot.api.matchhistory.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchSummary {
    @SerializedName("mapId")
    private int mMapId;
    @SerializedName("matchCreation")
    private long mMatchCreation;
    @SerializedName("matchDuration")
    private long mMatchDuration;
    @SerializedName("matchId")
    private long mMatchId;
    @SerializedName("matchVersion")
    private String mMatchVersion;
    @SerializedName("queueType")
    private String mQueueType;
    @SerializedName("region")
    private String mRegion;
    @SerializedName("season")
    private String mSeason;
    @SerializedName("participants")
    private List<Participant> mParticipants;
    @SerializedName("participantIdentities")
    private List<ParticipantIdentity> mParticipantIdentities;
    @SerializedName("matchType")
    private String mMatchType;
    @SerializedName("matchMode")
    private String mMatchMode;
    @SerializedName("platformId")
    private String mPlatformId;

    public int getMapId() {
        return mMapId;
    }

    public long getMatchCreation() {
        return mMatchCreation;
    }

    public long getMatchDuration() {
        return mMatchDuration;
    }

    public long getMatchId() {
        return mMatchId;
    }

    public String getMatchVersion() {
        return mMatchVersion;
    }

    public String getQueueType() {
        return mQueueType;
    }

    public String getRegion() {
        return mRegion;
    }

    public String getSeason() {
        return mSeason;
    }

    public List<Participant> getParticipants() {
        return mParticipants;
    }

    public List<ParticipantIdentity> getParticipantIdentities() {
        return mParticipantIdentities;
    }

    public String getMatchType() {
        return mMatchType;
    }

    public String getMatchMode() {
        return mMatchMode;
    }

    public String getPlatformId() {
        return mPlatformId;
    }
}
