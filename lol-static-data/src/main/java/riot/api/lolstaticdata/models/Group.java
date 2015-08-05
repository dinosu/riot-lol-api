package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class Group {
    @SerializedName("MaxGroupOwnable")
    private String mMaxGroupOwnable;
    @SerializedName("key")
    private String mKey;

    public String getMaxGroupOwnable() {
        return mMaxGroupOwnable;
    }

    public String getKey() {
        return mKey;
    }
}
