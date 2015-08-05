package riot.api.match.models;

import com.google.gson.annotations.SerializedName;

public class ParticipantStats {
    @SerializedName("winner")
    private boolean mWinner;
    @SerializedName("firstBloodAssist")
    private boolean mFirstBloodAssist;
    @SerializedName("firstBloodKill")
    private boolean mFirstBloodKill;
    @SerializedName("firstInhibitorAssist")
    private boolean mFirstInhibitorAssist;
    @SerializedName("firstInhibitorKill")
    private boolean mFirstInhibitorKill;
    @SerializedName("firstTowerAssist")
    private boolean mFirstTowerAssist;
    @SerializedName("firstTowerKill")
    private boolean mFirstTowerKill;
    @SerializedName("assists")
    private long mAssists;
    @SerializedName("champLevel")
    private long mChampLevel;
    @SerializedName("combatPlayerScore")
    private long mCombatPlayerScore;
    @SerializedName("deaths")
    private long mDeaths;
    @SerializedName("doubleKills")
    private long mDoubleKills;
    @SerializedName("goldEarned")
    private long mGoldEarned;
    @SerializedName("goldSpent")
    private long mGoldSpent;
    @SerializedName("inhibitorKills")
    private long mInhibitorKills;
    @SerializedName("item0")
    private long mItem0;
    @SerializedName("item1")
    private long mItem1;
    @SerializedName("item2")
    private long mItem2;
    @SerializedName("item3")
    private long mItem3;
    @SerializedName("item4")
    private long mItem4;
    @SerializedName("item5")
    private long mItem5;
    @SerializedName("item6")
    private long mItem6;
    @SerializedName("killingSprees")
    private long mKillingSprees;
    @SerializedName("kills")
    private long mKills;
    @SerializedName("largestCriticalStrike")
    private long mLargestCriticalStrike;
    @SerializedName("largestKillingSpree")
    private long mLargestKillingSpree;
    @SerializedName("largestMultiKill")
    private long mLargestMultiKill;
    @SerializedName("magicDamageDealt")
    private long mMagicDamageDealt;
    @SerializedName("magicDamageDealtToChampions")
    private long mMagicDamageDealtToChampions;
    @SerializedName("magicDamageTaken")
    private long mMagicDamageTaken;
    @SerializedName("minionsKilled")
    private long mMinionsKilled;
    @SerializedName("neutralMinionsKilled")
    private long mNeutralMinionsKilled;
    @SerializedName("neutralMinionsKilledEnemyJungle")
    private long mNeutralMinionsKilledEnemyJungle;
    @SerializedName("neutralMinionsKilledTeamJungle")
    private long mNeutralMinionsKilledTeamJungle;
    @SerializedName("nodeCapture")
    private long mNodeCapture;
    @SerializedName("nodeCaptureAssist")
    private long mNodeCaptureAssist;
    @SerializedName("nodeNeutralize")
    private long mNodeNeutralize;
    @SerializedName("nodeNeutralizeAssist")
    private long mNodeNeutralizeAssist;
    @SerializedName("objectivePlayerScore")
    private long mObjectivePlayerScore;
    @SerializedName("pentaKills")
    private long mPentaKills;
    @SerializedName("physicalDamageDealt")
    private long mPhysicalDamageDealt;
    @SerializedName("physicalDamageDealtToChampions")
    private long mPhysicalDamageDealtToChampions;
    @SerializedName("physicalDamageTaken")
    private long mPhysicalDamageTaken;
    @SerializedName("quadraKills")
    private long mQuadraKills;
    @SerializedName("sightWardsBoughtInGame")
    private long mSightWardsBoughtInGame;
    @SerializedName("teamObjective")
    private long mTeamObjective;
    @SerializedName("totalDamageDealt")
    private long mTotalDamageDealt;
    @SerializedName("totalDamageDealtToChampions")
    private long mTotalDamageDealtToChampions;
    @SerializedName("totalDamageTaken")
    private long mTotalDamageTaken;
    @SerializedName("totalHeal")
    private long mTotalHeal;
    @SerializedName("totalPlayerScore")
    private long mTotalPlayerScore;
    @SerializedName("totalScoreRank")
    private long mTotalScoreRank;
    @SerializedName("totalTimeCrowdControlDealt")
    private long mTotalTimeCrowdControlDealt;
    @SerializedName("totalUnitsHealed")
    private long mTotalUnitsHealed;
    @SerializedName("towerKills")
    private long mTowerKills;
    @SerializedName("tripleKills")
    private long mTripleKills;
    @SerializedName("trueDamageDealt")
    private long mTrueDamageDealt;
    @SerializedName("trueDamageDealtToChampions")
    private long mTrueDamageDealtToChampions;
    @SerializedName("trueDamageTaken")
    private long mTrueDamageTaken;
    @SerializedName("unrealKills")
    private long mUnrealKills;
    @SerializedName("visionWardsBoughtInGame")
    private long mVisionWardsBoughtInGame;
    @SerializedName("wardsKilled")
    private long mWardsKilled;
    @SerializedName("wardsPlaced")
    private long mWardsPlaced;

    public boolean isWinner() {
        return mWinner;
    }

    public boolean isFirstBloodAssist() {
        return mFirstBloodAssist;
    }

    public boolean isFirstBloodKill() {
        return mFirstBloodKill;
    }

    public boolean isFirstInhibitorAssist() {
        return mFirstInhibitorAssist;
    }

    public boolean isFirstInhibitorKill() {
        return mFirstInhibitorKill;
    }

    public boolean isFirstTowerAssist() {
        return mFirstTowerAssist;
    }

    public boolean isFirstTowerKill() {
        return mFirstTowerKill;
    }

    public long getAssists() {
        return mAssists;
    }

    public long getChampLevel() {
        return mChampLevel;
    }

    public long getCombatPlayerScore() {
        return mCombatPlayerScore;
    }

    public long getDeaths() {
        return mDeaths;
    }

    public long getDoubleKills() {
        return mDoubleKills;
    }

    public long getGoldEarned() {
        return mGoldEarned;
    }

    public long getGoldSpent() {
        return mGoldSpent;
    }

    public long getInhibitorKills() {
        return mInhibitorKills;
    }

    public long getItem0() {
        return mItem0;
    }

    public long getItem1() {
        return mItem1;
    }

    public long getItem2() {
        return mItem2;
    }

    public long getItem3() {
        return mItem3;
    }

    public long getItem4() {
        return mItem4;
    }

    public long getItem5() {
        return mItem5;
    }

    public long getItem6() {
        return mItem6;
    }

    public long getKillingSprees() {
        return mKillingSprees;
    }

    public long getKills() {
        return mKills;
    }

    public long getLargestCriticalStrike() {
        return mLargestCriticalStrike;
    }

    public long getLargestKillingSpree() {
        return mLargestKillingSpree;
    }

    public long getLargestMultiKill() {
        return mLargestMultiKill;
    }

    public long getMagicDamageDealt() {
        return mMagicDamageDealt;
    }

    public long getMagicDamageDealtToChampions() {
        return mMagicDamageDealtToChampions;
    }

    public long getMagicDamageTaken() {
        return mMagicDamageTaken;
    }

    public long getMinionsKilled() {
        return mMinionsKilled;
    }

    public long getNeutralMinionsKilled() {
        return mNeutralMinionsKilled;
    }

    public long getNeutralMinionsKilledEnemyJungle() {
        return mNeutralMinionsKilledEnemyJungle;
    }

    public long getNeutralMinionsKilledTeamJungle() {
        return mNeutralMinionsKilledTeamJungle;
    }

    public long getNodeCapture() {
        return mNodeCapture;
    }

    public long getNodeCaptureAssist() {
        return mNodeCaptureAssist;
    }

    public long getNodeNeutralize() {
        return mNodeNeutralize;
    }

    public long getNodeNeutralizeAssist() {
        return mNodeNeutralizeAssist;
    }

    public long getObjectivePlayerScore() {
        return mObjectivePlayerScore;
    }

    public long getPentaKills() {
        return mPentaKills;
    }

    public long getPhysicalDamageDealt() {
        return mPhysicalDamageDealt;
    }

    public long getPhysicalDamageDealtToChampions() {
        return mPhysicalDamageDealtToChampions;
    }

    public long getPhysicalDamageTaken() {
        return mPhysicalDamageTaken;
    }

    public long getQuadraKills() {
        return mQuadraKills;
    }

    public long getSightWardsBoughtInGame() {
        return mSightWardsBoughtInGame;
    }

    public long getTeamObjective() {
        return mTeamObjective;
    }

    public long getTotalDamageDealt() {
        return mTotalDamageDealt;
    }

    public long getTotalDamageDealtToChampions() {
        return mTotalDamageDealtToChampions;
    }

    public long getTotalDamageTaken() {
        return mTotalDamageTaken;
    }

    public long getTotalHeal() {
        return mTotalHeal;
    }

    public long getTotalPlayerScore() {
        return mTotalPlayerScore;
    }

    public long getTotalScoreRank() {
        return mTotalScoreRank;
    }

    public long getTotalTimeCrowdControlDealt() {
        return mTotalTimeCrowdControlDealt;
    }

    public long getTotalUnitsHealed() {
        return mTotalUnitsHealed;
    }

    public long getTowerKills() {
        return mTowerKills;
    }

    public long getTripleKills() {
        return mTripleKills;
    }

    public long getTrueDamageDealt() {
        return mTrueDamageDealt;
    }

    public long getTrueDamageDealtToChampions() {
        return mTrueDamageDealtToChampions;
    }

    public long getTrueDamageTaken() {
        return mTrueDamageTaken;
    }

    public long getUnrealKills() {
        return mUnrealKills;
    }

    public long getVisionWardsBoughtInGame() {
        return mVisionWardsBoughtInGame;
    }

    public long getWardsKilled() {
        return mWardsKilled;
    }

    public long getWardsPlaced() {
        return mWardsPlaced;
    }
}