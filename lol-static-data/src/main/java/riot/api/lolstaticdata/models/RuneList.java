package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class RuneList {
    @SerializedName("sanitizedDescription")
    private String mSanitizedDescription;
    @SerializedName("data")
    private Map<String, Rune> mData;
    @SerializedName("basic")
    private BasicData mBasic;
    @SerializedName("type")
    private String mType;

    public String getSanitizedDescription() {
        return mSanitizedDescription;
    }

    public Map<String, Rune> getData() {
        return mData;
    }

    public BasicData getBasic() {
        return mBasic;
    }

    public String getType() {
        return mType;
    }
}
