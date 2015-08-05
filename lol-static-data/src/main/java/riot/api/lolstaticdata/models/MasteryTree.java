package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MasteryTree {
    @SerializedName("Defense")
    private List<MasteryTreeList> mDefense;
    @SerializedName("Offense")
    private List<MasteryTreeList> mOffense;
    @SerializedName("Utility")
    private List<MasteryTreeList> mUtility;

    public List<MasteryTreeList> getDefense() {
        return mDefense;
    }

    public List<MasteryTreeList> getOffense() {
        return mOffense;
    }

    public List<MasteryTreeList> getUtility() {
        return mUtility;
    }
}
