package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class MetaData {
    @SerializedName("isRune")
    private boolean mIsRune;
    @SerializedName("tier")
    private String mTier;
    @SerializedName("type")
    private String mType;

    public boolean isRune() {
        return mIsRune;
    }

    public String getTier() {
        return mTier;
    }

    public String getType() {
        return mType;
    }
}
