package riot.api.currentgame.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Participant {
    @SerializedName("bot")
    private boolean mBot;
    @SerializedName("summonerId")
    private long mSummonerId;
    @SerializedName("summonerName")
    private String mSummonerName;
    @SerializedName("championId")
    private long mChampionId;
    @SerializedName("profileIconId")
    private long mProfileIconId;
    @SerializedName("spell1Id")
    private long mSummonerSpell1;
    @SerializedName("spell2Id")
    private long mSummonerSpell2;
    @SerializedName("teamId")
    private long mTeamId;
    @SerializedName("masteries")
    private List<Mastery> mMasteries;
    @SerializedName("runes")
    private List<Rune> mRunes;

    public boolean isBot() {
        return mBot;
    }

    public long getSummonerId() {
        return mSummonerId;
    }

    public String getSummonerName() {
        return mSummonerName;
    }

    public long getChampionId() {
        return mChampionId;
    }

    public long getProfileIconId() {
        return mProfileIconId;
    }

    public long getSummonerSpell1() {
        return mSummonerSpell1;
    }

    public long getSummonerSpell2() {
        return mSummonerSpell2;
    }

    public long getTeamId() {
        return mTeamId;
    }

    public List<Mastery> getMasteries() {
        return mMasteries;
    }

    public List<Rune> getRunes() {
        return mRunes;
    }
}
