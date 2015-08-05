package riot.api.team.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Team {
    @SerializedName("fullId")
    private String mFullId;
    @SerializedName("name")
    private String mName;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("tag")
    private String mTag;
    @SerializedName("matchHistory")
    private List<MatchHistorySummary> mMatchHistory;
    @SerializedName("teamStatDetails")
    private List<TeamStatDetail> mTeamStatDetails;
    @SerializedName("roster")
    private Roster mRoster;
    @SerializedName("createDate")
    private long mCreateDate;
    @SerializedName("lastGameDate")
    private long mLastGameDate;
    @SerializedName("lastJoinDate")
    private long mLastJoinDate;
    @SerializedName("lastJoinedRankedTeamQueueDate")
    private long mLastJoinedRankedTeamQueueDate;
    @SerializedName("modifyDate")
    private long mModifyDate;
    @SerializedName("secondLastJoinDate")
    private long mSecondLastJoinDate;
    @SerializedName("thirdLastJoinDate")
    private long mThirdLastJoinDate;

    public String getFullId() {
        return mFullId;
    }

    public String getName() {
        return mName;
    }

    public String getStatus() {
        return mStatus;
    }

    public String getTag() {
        return mTag;
    }

    public List<MatchHistorySummary> getMatchHistory() {
        return mMatchHistory;
    }

    public List<TeamStatDetail> getTeamStatDetails() {
        return mTeamStatDetails;
    }

    public Roster getRoster() {
        return mRoster;
    }

    public long getCreateDate() {
        return mCreateDate;
    }

    public long getLastGameDate() {
        return mLastGameDate;
    }

    public long getLastJoinDate() {
        return mLastJoinDate;
    }

    public long getLastJoinedRankedTeamQueueDate() {
        return mLastJoinedRankedTeamQueueDate;
    }

    public long getModifyDate() {
        return mModifyDate;
    }

    public long getSecondLastJoinDate() {
        return mSecondLastJoinDate;
    }

    public long getThirdLastJoinDate() {
        return mThirdLastJoinDate;
    }
}
