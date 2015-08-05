package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class GameMapList {
    @SerializedName("data")
    private Map<String, GameMap> mData;
    @SerializedName("type")
    private String mType;
    @SerializedName("version")
    private String mVersion;

    public Map<String, GameMap> getData() {
        return mData;
    }

    public String getType() {
        return mType;
    }

    public String getVersion() {
        return mVersion;
    }
}
