package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemTree {
    @SerializedName("tags")
    private List<String> mTags;
    @SerializedName("header")
    private String mHeader;

    public List<String> getTags() {
        return mTags;
    }

    public String getHeader() {
        return mHeader;
    }
}
