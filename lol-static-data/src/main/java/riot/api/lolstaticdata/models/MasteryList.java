package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class MasteryList {
    @SerializedName("data")
    private Map<String, Mastery> mData;
    @SerializedName("tree")
    private MasteryTree mTree;
    @SerializedName("type")
    private String mType;
    @SerializedName("version")
    private String mVersion;

    public Map<String, Mastery> getData() {
        return mData;
    }

    public MasteryTree getTree() {
        return mTree;
    }

    public String getType() {
        return mType;
    }

    public String getVersion() {
        return mVersion;
    }
}
