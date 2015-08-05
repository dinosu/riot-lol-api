package riot.api.matchhistory.models;

import com.google.gson.annotations.SerializedName;

public class Player {
    @SerializedName("matchHistoryUri")
    private String mMatchHistoryUri;
    @SerializedName("summonerName")
    private String mSummonerName;
    @SerializedName("profileIcon")
    private int mProfileIcon;
    @SerializedName("summonerId")
    private long mSummonerId;

    public String getMatchHistoryUri() {
        return mMatchHistoryUri;
    }

    public String getSummonerName() {
        return mSummonerName;
    }

    public int getProfileIcon() {
        return mProfileIcon;
    }

    public long getSummonerId() {
        return mSummonerId;
    }
}
