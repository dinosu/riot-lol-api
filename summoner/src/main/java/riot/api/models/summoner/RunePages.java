package riot.api.models.summoner;

import com.google.gson.annotations.SerializedName;

import java.util.Set;

public class RunePages {
    @SerializedName("summonerId")
    private long summonerId;
    @SerializedName("pages")
    private Set<RunePage> pages;

    public long getSummonerId() {
        return summonerId;
    }

    public Set<RunePage> getPages() {
        return pages;
    }
}
