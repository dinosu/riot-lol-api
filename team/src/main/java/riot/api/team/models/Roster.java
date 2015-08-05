package riot.api.team.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Roster {
    @SerializedName("ownerId")
    private long ownerId;
    @SerializedName("memberList")
    private List<TeamMemberInfo> memberList;
}
