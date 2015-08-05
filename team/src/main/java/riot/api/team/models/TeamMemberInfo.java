package riot.api.team.models;

import com.google.gson.annotations.SerializedName;

public class TeamMemberInfo {
    @SerializedName("inviteDate")
    private long inviteDate;
    @SerializedName("joinDate")
    private long joinDate;
    @SerializedName("playerId")
    private long playerId;
    @SerializedName("status")
    private String status;

    public long getInviteDate() {
        return inviteDate;
    }

    public long getJoinDate() {
        return joinDate;
    }

    public long getPlayerId() {
        return playerId;
    }

    public String getStatus() {
        return status;
    }
}
