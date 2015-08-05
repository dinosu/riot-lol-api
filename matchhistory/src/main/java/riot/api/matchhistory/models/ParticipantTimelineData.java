package riot.api.matchhistory.models;

import com.google.gson.annotations.SerializedName;

public class ParticipantTimelineData {
    @SerializedName("tenToTwenty")
    private double mTenToTwenty;
    @SerializedName("thirtyToEnd")
    private double mThirtyToEnd;
    @SerializedName("twentyToThirty")
    private double mTwentyToThirty;
    @SerializedName("zeroToTen")
    private double mZeroToTen;

    public double getTenToTwenty() {
        return mTenToTwenty;
    }

    public double getThirtyToEnd() {
        return mThirtyToEnd;
    }

    public double getTwentyToThirty() {
        return mTwentyToThirty;
    }

    public double getZeroToTen() {
        return mZeroToTen;
    }
}
