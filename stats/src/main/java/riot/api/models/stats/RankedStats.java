package riot.api.models.stats;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RankedStats {
    @SerializedName("champions")
    private List<ChampionStats> mChampions;
    @SerializedName("modifyDate")
    private long mModifyDate;
    @SerializedName("summonerId")
    private long mSummonerId;

    public List<ChampionStats> getChampions() {
        return mChampions;
    }

    public long getModifyDate() {
        return mModifyDate;
    }

    public long getSummonerId() {
        return mSummonerId;
    }
}
