package riot.api.models.summoner;

import com.google.gson.annotations.SerializedName;

import java.util.Set;

public class MasteryPages {
    @SerializedName("summonerId")
    private long mSummonerId;
    @SerializedName("pages")
    private Set<MasteryPage> mPages;

    public long getSummonerId() {
        return mSummonerId;
    }

    public Set<MasteryPage> getPages() {
        return mPages;
    }
}
