package riot.api.models.summoner;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MasteryPage {
    @SerializedName("current")
    private boolean mCurrent;
    @SerializedName("id")
    private long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("masteries")
    private List<Mastery> mMasteries;

    public boolean isCurrent() {
        return mCurrent;
    }

    public long getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public List<Mastery> getMasteries() {
        return mMasteries;
    }
}
