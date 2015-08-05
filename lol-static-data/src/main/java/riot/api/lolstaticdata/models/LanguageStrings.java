package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class LanguageStrings {
    @SerializedName("data")
    private LanguageStringsData mData;
    @SerializedName("type")
    private String mType;
    @SerializedName("version")
    private String mVersion;

    public LanguageStringsData getData() {
        return mData;
    }

    public String getType() {
        return mType;
    }

    public String getVersion() {
        return mVersion;
    }
}
