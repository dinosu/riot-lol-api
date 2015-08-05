package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Realm {
    @SerializedName("n")
    private Map<String, String> mN;
    @SerializedName("cdn")
    private String mCdn;
    @SerializedName("css")
    private String mCss;
    @SerializedName("dd")
    private String mDd;
    @SerializedName("l")
    private String mL;
    @SerializedName("lg")
    private String mLg;
    @SerializedName("store")
    private String mStore;
    @SerializedName("v")
    private String mV;
    @SerializedName("profileiconmax")
    private int mProfileiconmax;

    public Map<String, String> getN() {
        return mN;
    }

    public String getCdn() {
        return mCdn;
    }

    public String getCss() {
        return mCss;
    }

    public String getDd() {
        return mDd;
    }

    public String getL() {
        return mL;
    }

    public String getLg() {
        return mLg;
    }

    public String getStore() {
        return mStore;
    }

    public String getV() {
        return mV;
    }

    public int getProfileiconmax() {
        return mProfileiconmax;
    }
}
