package riot.api.models.stats;

import com.google.gson.annotations.SerializedName;

/**
 * DEPRECATED
 **/

public class PlayerStatsSummary {
    @SerializedName("aggregatedStats")
    private AggregatedStats mAggregatedStats;
    @SerializedName("losses")
    private int mLosses;
    @SerializedName("wins")
    private int mWins;
    @SerializedName("modifyDate")
    private long mModifyDate;
    @SerializedName("playerStatSummaryType")
    private String mPlayerStatSummaryType;

    public AggregatedStats getAggregatedStats() {
        return mAggregatedStats;
    }

    public int getLosses() {
        return mLosses;
    }

    public int getWins() {
        return mWins;
    }

    public long getModifyDate() {
        return mModifyDate;
    }

    public String getPlayerStatSummaryType() {
        return mPlayerStatSummaryType;
    }
}
