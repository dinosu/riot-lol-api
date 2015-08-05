package riot.api.currentgame.models;

import com.google.gson.annotations.SerializedName;

public class Mastery {
    @SerializedName("rank")
    private int mRank;
    @SerializedName("masteryId")
    private long mMasteryId;

    public int getRank() {
        return mRank;
    }

    public long getMasteryId() {
        return mMasteryId;
    }
}
