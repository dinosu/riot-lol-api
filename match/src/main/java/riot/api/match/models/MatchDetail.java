package riot.api.match.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchDetail {
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
    @SerializedName("participantIdentities")
    private List<ParticipantIdentity> mParticipantIdentities;
    @SerializedName("participants")
    private List<Participant> mParticipants;
    @SerializedName("teams")
    private List<Team> mTeams;
    @SerializedName("timeline")
    private Timeline mTimeline;
    @SerializedName("matchMode")
    private String mMatchMode;
    @SerializedName("matchType")
    private String mMatchType;
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

    public List<ParticipantIdentity> getParticipantIdentities() {
        return mParticipantIdentities;
    }

    public List<Participant> getParticipants() {
        return mParticipants;
    }

    public List<Team> getTeams() {
        return mTeams;
    }

    public Timeline getTimeline() {
        return mTimeline;
    }

    public String getMatchMode() {
        return mMatchMode;
    }

    public String getMatchType() {
        return mMatchType;
    }

    public String getPlatformId() {
        return mPlatformId;
    }
}
