package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SpellVars {
    @SerializedName("coeff")
    private List<Double> mCoeff;
    @SerializedName("dyn")
    private String mDyn;
    @SerializedName("key")
    private String mKey;
    @SerializedName("link")
    private String mLink;
    @SerializedName("ranksWith")
    private String mRanksWith;

    public List<Double> getCoeff() {
        return mCoeff;
    }

    public String getDyn() {
        return mDyn;
    }

    public String getKey() {
        return mKey;
    }

    public String getLink() {
        return mLink;
    }

    public String getRanksWith() {
        return mRanksWith;
    }
}
