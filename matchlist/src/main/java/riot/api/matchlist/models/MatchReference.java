package riot.api.matchlist.models;

import com.google.gson.annotations.SerializedName;

public class MatchReference {
    @SerializedName("champion")
    private long mChampion;
    @SerializedName("lane")
    private String mLane;
    @SerializedName("matchId")
    private long mMatchId;
    @SerializedName("queue")
    private String mQueue; // Legal values: RANKED_SOLO_5x5, RANKED_TEAM_3x3, RANKED_TEAM_5x5
    @SerializedName("role")
    private String mRole; // Legal values: DUO, NONE, SOLO, DUO_CARRY, DUO_SUPPORT
    @SerializedName("season")
    private long mSeason; // Legal values: PRESEASON3, SEASON3, PRESEASON2014, SEASON2014, PRESEASON2015, SEASON2015
    @SerializedName("timestamp")
    private long mTimestamp;

    public long getChampion() {
        return mChampion;
    }

    public String getLane() {
        return mLane;
    }

    public long getMatchId() {
        return mMatchId;
    }

    public String getQueue() {
        return mQueue;
    }

    public String getRole() {
        return mRole;
    }

    public long getSeason() {
        return mSeason;
    }

    public long getTimestamp() {
        return mTimestamp;
    }
}
