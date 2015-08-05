package riot.api.models.stats;

/**
 * DEPRECATED
 **/

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlayerStatsSummaryList {
    @SerializedName("playerStatSummaries")
    private List<PlayerStatsSummary> mPlayerStatSummaries;
    @SerializedName("summonerId")
    private long mSummonerId;

    public List<PlayerStatsSummary> getPlayerStatSummaries() {
        return mPlayerStatSummaries;
    }

    public long getSummonerId() {
        return mSummonerId;
    }
}
