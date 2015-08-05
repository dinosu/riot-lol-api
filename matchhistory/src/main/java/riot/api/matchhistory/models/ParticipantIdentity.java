package riot.api.matchhistory.models;

import com.google.gson.annotations.SerializedName;

public class ParticipantIdentity {
    @SerializedName("participantId")
    private int mParticipantId;
    @SerializedName("player")
    private Player mPlayer;

    public int getParticipantId() {
        return mParticipantId;
    }

    public Player getPlayer() {
        return mPlayer;
    }
}
