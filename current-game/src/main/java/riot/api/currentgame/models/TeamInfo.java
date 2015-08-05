package riot.api.currentgame.models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class TeamInfo {
    @SerializedName("tag")
    private String mTag;
    @SerializedName("name")
    private String mName;
    @SerializedName("memberStatus")
    private String mMemberStatus;
    @SerializedName("secondsUntilEligibleForDeletion")
    private long mSecondsUntilEligibleForDeletion;
    @SerializedName("teamId")
    private Map<String, String> mTeamId;

    public String getTag() {
        return mTag;
    }

    public String getName() {
        return mName;
    }

    public String getMemberStatus() {
        return mMemberStatus;
    }

    public long getSecondsUntilEligibleForDeletion() {
        return mSecondsUntilEligibleForDeletion;
    }

    public Map<String, String> getTeamId() {
        return mTeamId;
    }
}
