package riot.api.models.stats;

import com.google.gson.annotations.SerializedName;

public class ChampionStats {
    @SerializedName("id")
    private int mId;
    @SerializedName("stats")
    private AggregatedStats mStats;

    public int getId() {
        return mId;
    }

    public AggregatedStats getStats() {
        return mStats;
    }
}
