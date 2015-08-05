package riot.api.matchhistory.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Participant {
    @SerializedName("championId")
    private int mChampionId;
    @SerializedName("participantId")
    private int mParticipantId;
    @SerializedName("spell1Id")
    private int mSummonerSpell1;
    @SerializedName("spell2Id")
    private int mSummonerSpell2;
    @SerializedName("teamId")
    private int mTeamId;
    @SerializedName("stats")
    private ParticipantStats mStats;
    @SerializedName("timeline")
    private ParticipantTimeline mTimeline;
    @SerializedName("runes")
    private List<Rune> mRunes;
    @SerializedName("masteries")
    private List<Mastery> mMasteries;
    @SerializedName("highestAchievedSeasonTier")
    private String mHighestAchievedSeasonTier;

    public int getChampionId() {
        return mChampionId;
    }

    public int getParticipantId() {
        return mParticipantId;
    }

    public int getSummonerSpell1() {
        return mSummonerSpell1;
    }

    public int getSummonerSpell2() {
        return mSummonerSpell2;
    }

    public int getTeamId() {
        return mTeamId;
    }

    public ParticipantStats getStats() {
        return mStats;
    }

    public ParticipantTimeline getTimeline() {
        return mTimeline;
    }

    public List<Rune> getRunes() {
        return mRunes;
    }

    public List<Mastery> getMasteries() {
        return mMasteries;
    }

    public String getHighestAchievedSeasonTier() {
        return mHighestAchievedSeasonTier;
    }
}
