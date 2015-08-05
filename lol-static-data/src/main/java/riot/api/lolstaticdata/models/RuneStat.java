package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class RuneStat {
    @SerializedName("type")
    private String mType;
    @SerializedName("value")
    private double mValue;

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public double getValue() {
        return mValue;
    }

    public void setValue(double value) {
        mValue = value;
    }
}
