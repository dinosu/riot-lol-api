package riot.api.match.models;

import com.google.gson.annotations.SerializedName;

public class ParticipantFrame {
    @SerializedName("currentGold")
    private int mCurrentGold;
    @SerializedName("jungleMinionsKilled")
    private int mJungleMinionsKilled;
    @SerializedName("level")
    private int mLevel;
    @SerializedName("minionsKilled")
    private int mMinionsKilled;
    @SerializedName("participantId")
    private int mParticipantId;
    @SerializedName("totalGold")
    private int mTotalGold;
    @SerializedName("xp")
    private int mXp;
    @SerializedName("position")
    private Position mPosition;

    public int getCurrentGold() {
        return mCurrentGold;
    }

    public int getJungleMinionsKilled() {
        return mJungleMinionsKilled;
    }

    public int getLevel() {
        return mLevel;
    }

    public int getMinionsKilled() {
        return mMinionsKilled;
    }

    public int getParticipantId() {
        return mParticipantId;
    }

    public int getTotalGold() {
        return mTotalGold;
    }

    public int getXp() {
        return mXp;
    }

    public Position getPosition() {
        return mPosition;
    }
}
