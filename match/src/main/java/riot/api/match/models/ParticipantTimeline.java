package riot.api.match.models;

import com.google.gson.annotations.SerializedName;

public class ParticipantTimeline {
    @SerializedName("lane")
    private String mLane;
    @SerializedName("role")
    private String mRole;
    @SerializedName("ancientGolemAssistsPerMinCounts")
    private ParticipantTimelineData mAncientGolemAssistsPerMinCounts;
    @SerializedName("ancientGolemKillsPerMinCounts")
    private ParticipantTimelineData mAncientGolemKillsPerMinCounts;
    @SerializedName("assistedLaneDeathsPerMinDeltas")
    private ParticipantTimelineData mAssistedLaneDeathsPerMinDeltas;
    @SerializedName("assistedLaneKillsPerMinDeltas")
    private ParticipantTimelineData mAssistedLaneKillsPerMinDeltas;
    @SerializedName("baronAssistsPerMinCounts")
    private ParticipantTimelineData mBaronAssistsPerMinCounts;
    @SerializedName("baronKillsPerMinCounts")
    private ParticipantTimelineData mBaronKillsPerMinCounts;
    @SerializedName("creepsPerMinDeltas")
    private ParticipantTimelineData mCreepsPerMinDeltas;
    @SerializedName("csDiffPerMinDeltas")
    private ParticipantTimelineData mCsDiffPerMinDeltas;
    @SerializedName("damageTakenDiffPerMinDeltas")
    private ParticipantTimelineData mDamageTakenDiffPerMinDeltas;
    @SerializedName("damageTakenPerMinDeltas")
    private ParticipantTimelineData mDamageTakenPerMinDeltas;
    @SerializedName("dragonAssistsPerMinCounts")
    private ParticipantTimelineData mDragonAssistsPerMinCounts;
    @SerializedName("dragonKillsPerMinCounts")
    private ParticipantTimelineData mDragonKillsPerMinCounts;
    @SerializedName("elderLizardAssistsPerMinCounts")
    private ParticipantTimelineData mElderLizardAssistsPerMinCounts;
    @SerializedName("elderLizardKillsPerMinCounts")
    private ParticipantTimelineData mElderLizardKillsPerMinCounts;
    @SerializedName("goldPerMinDeltas")
    private ParticipantTimelineData mGoldPerMinDeltas;
    @SerializedName("inhibitorAssistsPerMinCounts")
    private ParticipantTimelineData mInhibitorAssistsPerMinCounts;
    @SerializedName("inhibitorKillsPerMinCounts")
    private ParticipantTimelineData mInhibitorKillsPerMinCounts;
    @SerializedName("towerAssistsPerMinCounts")
    private ParticipantTimelineData mTowerAssistsPerMinCounts;
    @SerializedName("towerKillsPerMinCounts")
    private ParticipantTimelineData mTowerKillsPerMinCounts;
    @SerializedName("towerKillsPerMinDeltas")
    private ParticipantTimelineData mTowerKillsPerMinDeltas;
    @SerializedName("vilemawAssistsPerMinCounts")
    private ParticipantTimelineData mVilemawAssistsPerMinCounts;
    @SerializedName("vilemawKillsPerMinCounts")
    private ParticipantTimelineData mVilemawKillsPerMinCounts;
    @SerializedName("wardsPerMinDeltas")
    private ParticipantTimelineData mWardsPerMinDeltas;
    @SerializedName("xpDiffPerMinDeltas")
    private ParticipantTimelineData mXpDiffPerMinDeltas;
    @SerializedName("xpPerMinDeltas")
    private ParticipantTimelineData mXpPerMinDeltas;

    public String getLane() {
        return mLane;
    }

    public String getRole() {
        return mRole;
    }

    public ParticipantTimelineData getAncientGolemAssistsPerMinCounts() {
        return mAncientGolemAssistsPerMinCounts;
    }

    public ParticipantTimelineData getAncientGolemKillsPerMinCounts() {
        return mAncientGolemKillsPerMinCounts;
    }

    public ParticipantTimelineData getAssistedLaneDeathsPerMinDeltas() {
        return mAssistedLaneDeathsPerMinDeltas;
    }

    public ParticipantTimelineData getAssistedLaneKillsPerMinDeltas() {
        return mAssistedLaneKillsPerMinDeltas;
    }

    public ParticipantTimelineData getBaronAssistsPerMinCounts() {
        return mBaronAssistsPerMinCounts;
    }

    public ParticipantTimelineData getBaronKillsPerMinCounts() {
        return mBaronKillsPerMinCounts;
    }

    public ParticipantTimelineData getCreepsPerMinDeltas() {
        return mCreepsPerMinDeltas;
    }

    public ParticipantTimelineData getCsDiffPerMinDeltas() {
        return mCsDiffPerMinDeltas;
    }

    public ParticipantTimelineData getDamageTakenDiffPerMinDeltas() {
        return mDamageTakenDiffPerMinDeltas;
    }

    public ParticipantTimelineData getDamageTakenPerMinDeltas() {
        return mDamageTakenPerMinDeltas;
    }

    public ParticipantTimelineData getDragonAssistsPerMinCounts() {
        return mDragonAssistsPerMinCounts;
    }

    public ParticipantTimelineData getDragonKillsPerMinCounts() {
        return mDragonKillsPerMinCounts;
    }

    public ParticipantTimelineData getElderLizardAssistsPerMinCounts() {
        return mElderLizardAssistsPerMinCounts;
    }

    public ParticipantTimelineData getElderLizardKillsPerMinCounts() {
        return mElderLizardKillsPerMinCounts;
    }

    public ParticipantTimelineData getGoldPerMinDeltas() {
        return mGoldPerMinDeltas;
    }

    public ParticipantTimelineData getInhibitorAssistsPerMinCounts() {
        return mInhibitorAssistsPerMinCounts;
    }

    public ParticipantTimelineData getInhibitorKillsPerMinCounts() {
        return mInhibitorKillsPerMinCounts;
    }

    public ParticipantTimelineData getTowerAssistsPerMinCounts() {
        return mTowerAssistsPerMinCounts;
    }

    public ParticipantTimelineData getTowerKillsPerMinCounts() {
        return mTowerKillsPerMinCounts;
    }

    public ParticipantTimelineData getTowerKillsPerMinDeltas() {
        return mTowerKillsPerMinDeltas;
    }

    public ParticipantTimelineData getVilemawAssistsPerMinCounts() {
        return mVilemawAssistsPerMinCounts;
    }

    public ParticipantTimelineData getVilemawKillsPerMinCounts() {
        return mVilemawKillsPerMinCounts;
    }

    public ParticipantTimelineData getWardsPerMinDeltas() {
        return mWardsPerMinDeltas;
    }

    public ParticipantTimelineData getXpDiffPerMinDeltas() {
        return mXpDiffPerMinDeltas;
    }

    public ParticipantTimelineData getXpPerMinDeltas() {
        return mXpPerMinDeltas;
    }
}
