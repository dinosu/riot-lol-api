package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class SummonerSpellList {
    @SerializedName("data")
    private Map<String, SummonerSpell> mData;
    @SerializedName("type")
    private String mType;
    @SerializedName("version")
    private String mVersion;

    public Map<String, SummonerSpell> getData() {
        return mData;
    }

    public String getType() {
        return mType;
    }

    public String getVersion() {
        return mVersion;
    }
}
