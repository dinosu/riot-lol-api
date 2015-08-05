package riot.api.matchhistory.models;

import com.google.gson.annotations.SerializedName;

public class Rune {
    @SerializedName("rank")
    private int mRank;
    @SerializedName("runeId")
    private long mRuneId;

    public int getRank() {
        return mRank;
    }

    public long getRuneId() {
        return mRuneId;
    }
}
