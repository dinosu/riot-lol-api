package riot.api.match.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Event {
    @SerializedName("creatorId")
    private int mCreatorId;
    @SerializedName("itemAfter")
    private int mItemAfter;
    @SerializedName("itemBefore")
    private int mItemBefore;
    @SerializedName("itemId")
    private int mItemId;
    @SerializedName("killerId")
    private int mKillerId;
    @SerializedName("participantId")
    private int mParticipantId;
    @SerializedName("skillSlot")
    private int mSkillSlot;
    @SerializedName("teamId")
    private int mTeamId;
    @SerializedName("victimId")
    private int mVictimId;
    @SerializedName("buildingType")
    private String mBuildingType;
    @SerializedName("eventType")
    private String mEventType;
    @SerializedName("laneType")
    private String mLaneType;
    @SerializedName("levelUpType")
    private String mLevelUpType;
    @SerializedName("monsterType")
    private String mMonsterType;
    @SerializedName("towerType")
    private String mTowerType;
    @SerializedName("wardType")
    private String mWardType;
    @SerializedName("assistingParticipantIds")
    private List<Integer> mAssistingParticipantIds;
    @SerializedName("position")
    private Position mPosition;
    @SerializedName("timestamp")
    private long mTimestamp;

    public int getCreatorId() {
        return mCreatorId;
    }

    public int getItemAfter() {
        return mItemAfter;
    }

    public int getItemBefore() {
        return mItemBefore;
    }

    public int getItemId() {
        return mItemId;
    }

    public int getKillerId() {
        return mKillerId;
    }

    public int getParticipantId() {
        return mParticipantId;
    }

    public int getSkillSlot() {
        return mSkillSlot;
    }

    public int getTeamId() {
        return mTeamId;
    }

    public int getVictimId() {
        return mVictimId;
    }

    public String getBuildingType() {
        return mBuildingType;
    }

    public String getEventType() {
        return mEventType;
    }

    public String getLaneType() {
        return mLaneType;
    }

    public String getLevelUpType() {
        return mLevelUpType;
    }

    public String getMonsterType() {
        return mMonsterType;
    }

    public String getTowerType() {
        return mTowerType;
    }

    public String getWardType() {
        return mWardType;
    }

    public List<Integer> getAssistingParticipantIds() {
        return mAssistingParticipantIds;
    }

    public Position getPosition() {
        return mPosition;
    }

    public long getTimestamp() {
        return mTimestamp;
    }
}
