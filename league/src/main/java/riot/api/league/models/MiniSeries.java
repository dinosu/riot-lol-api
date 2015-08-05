package riot.api.league.models;

import com.google.gson.annotations.SerializedName;

public class MiniSeries {
    @SerializedName("losses")
    private int mLosses;
    @SerializedName("target")
    private int mTarget;
    @SerializedName("wins")
    private int mWins;
    @SerializedName("progress")
    private String mProgress;

    public int getLosses() {
        return mLosses;
    }

    public int getTarget() {
        return mTarget;
    }

    public int getWins() {
        return mWins;
    }

    public String getProgress() {
        return mProgress;
    }
}
