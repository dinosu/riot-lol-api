package riot.api.game.models;

import com.google.gson.annotations.SerializedName;

public class RawStats {
    @SerializedName("nexusKilled")
    private boolean mNexusKilled;
    @SerializedName("win")
    private boolean mWin;
    @SerializedName("team")
    private int mTeam;
    @SerializedName("timePlayed")
    private int mTimePlayed;
    @SerializedName("level")
    private int mLevel;
    @SerializedName("gold")
    private int mGold;
    @SerializedName("goldEarned")
    private int mGoldEarned;
    @SerializedName("goldSpent")
    private int mGoldSpent;
    @SerializedName("championsKilled")
    private int mChampionsKilled;
    @SerializedName("numDeaths")
    private int mNumDeaths;
    @SerializedName("assists")
    private int mAssists;
    @SerializedName("firstBlood")
    private int mFirstBlood;
    @SerializedName("largestMultiKill")
    private int mLargestMultiKill;
    @SerializedName("doubleKills")
    private int mDoubleKills;
    @SerializedName("tripleKills")
    private int mTripleKills;
    @SerializedName("quadraKills")
    private int mQuadraKills;
    @SerializedName("pentaKills")
    private int mPentaKills;
    @SerializedName("unrealKills")
    private int mUnrealKills;
    @SerializedName("killingSprees")
    private int mKillingSprees;
    @SerializedName("largestKillingSpree")
    private int mLargestKillingSpree;
    @SerializedName("minionsDenied")
    private int mMinionsDenied;
    @SerializedName("minionsKilled")
    private int mMinionsKilled;
    @SerializedName("neutralMinionsKilled")
    private int mNeutralMinionsKilled;
    @SerializedName("neutralMinionsKilledEnemyJungle")
    private int mNeutralMinionsKilledEnemyJungle;
    @SerializedName("neutralMinionsKilledYourJungle")
    private int mNeutralMinionsKilledYourJungle;
    @SerializedName("superMonsterKilled")
    private int mSuperMonsterKilled;
    @SerializedName("numItemsBought")
    private int mNumItemsBought;
    @SerializedName("consumablesPurchased")
    private int mConsumablesPurchased;
    @SerializedName("sightWardsBought")
    private int mSightWardsBought;
    @SerializedName("visionWardsBought")
    private int mVisionWardsBought;
    @SerializedName("wardKilled")
    private int mWardKilled;
    @SerializedName("wardPlaced")
    private int mWardPlaced;
    @SerializedName("itemsPurchased")
    private int mItemsPurchased;
    @SerializedName("item0")
    private int mItem0;
    @SerializedName("item1")
    private int mItem1;
    @SerializedName("item2")
    private int mItem2;
    @SerializedName("item3")
    private int mItem3;
    @SerializedName("item4")
    private int mItem4;
    @SerializedName("item5")
    private int mItem5;
    @SerializedName("item6")
    private int mItem6;
    @SerializedName("legendaryItemsCreated")
    private int mLegendaryItemsCreated;
    @SerializedName("totalDamageDealt")
    private int mTotalDamageDealt;
    @SerializedName("totalDamageDealtToChampions")
    private int mTotalDamageDealtToChampions;
    @SerializedName("physicalDamageDealtToChampions")
    private int mPhysicalDamageDealtToChampions;
    @SerializedName("magicDamageDealtToChampions")
    private int mMagicDamageDealtToChampions;
    @SerializedName("trueDamageDealtToChampions")
    private int mTrueDamageDealtToChampions;
    @SerializedName("largestCriticalStrike")
    private int mLargestCriticalStrike;
    @SerializedName("damageDealtPlayer")
    private int mDamageDealtPlayer;
    @SerializedName("physicalDamageDealtPlayer")
    private int mPhysicalDamageDealtPlayer;
    @SerializedName("magicDamageDealtPlayer")
    private int mMagicDamageDealtPlayer;
    @SerializedName("trueDamageDealtPlayer")
    private int mTrueDamageDealtPlayer;
    @SerializedName("totalHeal")
    private int mTotalHeal;
    @SerializedName("totalUnitsHealed")
    private int mTotalUnitsHealed;
    @SerializedName("totalTimeCrowdControlDealt")
    private int mTmTotalTimeCrowdControlDealt;
    @SerializedName("totalDamageTaken")
    private int mTotalDamageTaken;
    @SerializedName("physicalDamageTaken")
    private int mPhysicalDamageTaken;
    @SerializedName("magicDamageTaken")
    private int mMagicDamageTaken;
    @SerializedName("trueDamageTaken")
    private int mTrueDamageTaken;
    @SerializedName("turretsKilled")
    private int mTurretsKilled;
    @SerializedName("barracksKilled")
    private int mBarracksKilled;
    @SerializedName("spell1Cast")
    private int mSpell1Cast;
    @SerializedName("spell2Cast")
    private int mSpell2Cast;
    @SerializedName("spell3Cast")
    private int mSpell3Cast;
    @SerializedName("spell4Cast")
    private int mSpell4Cast;
    @SerializedName("summonSpell1Cast")
    private int mSummonSpell1Cast;
    @SerializedName("summonSpell2Cast")
    private int mSummonSpell2Cast;
    @SerializedName("nodeCapture")
    private int mNodeCapture;
    @SerializedName("nodeCaptureAssist")
    private int mNodeCaptureAssist;
    @SerializedName("nodeNeutralize")
    private int mNodeNeutralize;
    @SerializedName("nodeNeutralizeAssist")
    private int mNodeNeutralizeAssist;
    @SerializedName("objectivePlayerScore")
    private int mObjectivePlayerScore;
    @SerializedName("combatPlayerScore")
    private int mCombatPlayerScore;
    @SerializedName("totalPlayerScore")
    private int mTotalPlayerScore;
    @SerializedName("totalScoreRank")
    private int mTotalScoreRank;
    @SerializedName("teamObjective")
    private int mTeamObjective;
    @SerializedName("victoryPointTotal")
    private int mVictoryPointTotal;

    public boolean isNexusKilled() {
        return mNexusKilled;
    }

    public boolean isWin() {
        return mWin;
    }

    public int getTeam() {
        return mTeam;
    }

    public int getTimePlayed() {
        return mTimePlayed;
    }

    public int getLevel() {
        return mLevel;
    }

    public int getChampionsKilled() {
        return mChampionsKilled;
    }

    public int getNumDeaths() {
        return mNumDeaths;
    }

    public int getAssists() {
        return mAssists;
    }

    public int getGold() {
        return mGold;
    }

    public int getGoldEarned() {
        return mGoldEarned;
    }

    public int getGoldSpent() {
        return mGoldSpent;
    }

    public int getFirstBlood() {
        return mFirstBlood;
    }

    public int getLargestMultiKill() {
        return mLargestMultiKill;
    }

    public int getDoubleKills() {
        return mDoubleKills;
    }

    public int getTripleKills() {
        return mTripleKills;
    }

    public int getQuadraKills() {
        return mQuadraKills;
    }

    public int getPentaKills() {
        return mPentaKills;
    }

    public int getUnrealKills() {
        return mUnrealKills;
    }

    public int getKillingSprees() {
        return mKillingSprees;
    }

    public int getLargestKillingSpree() {
        return mLargestKillingSpree;
    }

    public int getMinionsDenied() {
        return mMinionsDenied;
    }

    public int getMinionsKilled() {
        return mMinionsKilled;
    }

    public int getNeutralMinionsKilled() {
        return mNeutralMinionsKilled;
    }

    public int getNeutralMinionsKilledEnemyJungle() {
        return mNeutralMinionsKilledEnemyJungle;
    }

    public int getNeutralMinionsKilledYourJungle() {
        return mNeutralMinionsKilledYourJungle;
    }

    public int getSuperMonsterKilled() {
        return mSuperMonsterKilled;
    }

    public int getNumItemsBought() {
        return mNumItemsBought;
    }

    public int getConsumablesPurchased() {
        return mConsumablesPurchased;
    }

    public int getSightWardsBought() {
        return mSightWardsBought;
    }

    public int getVisionWardsBought() {
        return mVisionWardsBought;
    }

    public int getWardKilled() {
        return mWardKilled;
    }

    public int getWardPlaced() {
        return mWardPlaced;
    }

    public int getItemsPurchased() {
        return mItemsPurchased;
    }

    public int getItem0() {
        return mItem0;
    }

    public int getItem1() {
        return mItem1;
    }

    public int getItem2() {
        return mItem2;
    }

    public int getItem3() {
        return mItem3;
    }

    public int getItem4() {
        return mItem4;
    }

    public int getItem5() {
        return mItem5;
    }

    public int getItem6() {
        return mItem6;
    }

    public int getLegendaryItemsCreated() {
        return mLegendaryItemsCreated;
    }

    public int getTotalDamageDealt() {
        return mTotalDamageDealt;
    }

    public int getTotalDamageDealtToChampions() {
        return mTotalDamageDealtToChampions;
    }

    public int getPhysicalDamageDealtToChampions() {
        return mPhysicalDamageDealtToChampions;
    }

    public int getMagicDamageDealtToChampions() {
        return mMagicDamageDealtToChampions;
    }

    public int getTrueDamageDealtToChampions() {
        return mTrueDamageDealtToChampions;
    }

    public int getLargestCriticalStrike() {
        return mLargestCriticalStrike;
    }

    public int getDamageDealtPlayer() {
        return mDamageDealtPlayer;
    }

    public int getPhysicalDamageDealtPlayer() {
        return mPhysicalDamageDealtPlayer;
    }

    public int getMagicDamageDealtPlayer() {
        return mMagicDamageDealtPlayer;
    }

    public int getTrueDamageDealtPlayer() {
        return mTrueDamageDealtPlayer;
    }

    public int getTotalHeal() {
        return mTotalHeal;
    }

    public int getTotalUnitsHealed() {
        return mTotalUnitsHealed;
    }

    public int getTmTotalTimeCrowdControlDealt() {
        return mTmTotalTimeCrowdControlDealt;
    }

    public int getTotalDamageTaken() {
        return mTotalDamageTaken;
    }

    public int getPhysicalDamageTaken() {
        return mPhysicalDamageTaken;
    }

    public int getMagicDamageTaken() {
        return mMagicDamageTaken;
    }

    public int getTrueDamageTaken() {
        return mTrueDamageTaken;
    }

    public int getTurretsKilled() {
        return mTurretsKilled;
    }

    public int getBarracksKilled() {
        return mBarracksKilled;
    }

    public int getSpell1Cast() {
        return mSpell1Cast;
    }

    public int getSpell2Cast() {
        return mSpell2Cast;
    }

    public int getSpell3Cast() {
        return mSpell3Cast;
    }

    public int getSpell4Cast() {
        return mSpell4Cast;
    }

    public int getSummonSpell1Cast() {
        return mSummonSpell1Cast;
    }

    public int getSummonSpell2Cast() {
        return mSummonSpell2Cast;
    }

    public int getNodeCapture() {
        return mNodeCapture;
    }

    public int getNodeCaptureAssist() {
        return mNodeCaptureAssist;
    }

    public int getNodeNeutralize() {
        return mNodeNeutralize;
    }

    public int getNodeNeutralizeAssist() {
        return mNodeNeutralizeAssist;
    }

    public int getObjectivePlayerScore() {
        return mObjectivePlayerScore;
    }

    public int getCombatPlayerScore() {
        return mCombatPlayerScore;
    }

    public int getTotalPlayerScore() {
        return mTotalPlayerScore;
    }

    public int getTotalScoreRank() {
        return mTotalScoreRank;
    }

    public int getTeamObjective() {
        return mTeamObjective;
    }

    public int getVictoryPointTotal() {
        return mVictoryPointTotal;
    }
}
