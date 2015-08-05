package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class ChampionList {
    @SerializedName("data")
    private Map<String, Champion> mData;
    @SerializedName("keys")
    private Map<String, String> mKeys;
    @SerializedName("format")
    private String mFormat;
    @SerializedName("type")
    private String mType;
    @SerializedName("version")
    private String mVersion;

    public Map<String, Champion> getData() {
        return mData;
    }

    public Map<String, String> getKeys() {
        return mKeys;
    }

    public String getFormat() {
        return mFormat;
    }

    public String getType() {
        return mType;
    }

    public String getVersion() {
        return mVersion;
    }
}
