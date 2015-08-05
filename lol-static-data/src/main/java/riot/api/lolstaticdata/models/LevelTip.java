package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LevelTip {
    @SerializedName("effect")
    private List<String> mEffect;
    @SerializedName("label")
    private List<String> mLabel;

    public List<String> getEffect() {
        return mEffect;
    }

    public List<String> getLabel() {
        return mLabel;
    }
}
