package riot.api.models.summoner;

import com.google.gson.annotations.SerializedName;

import java.util.Set;

public class RunePage {
    @SerializedName("current")
    private boolean mCurrent;
    @SerializedName("id")
    private long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("slots")
    private Set<RuneSlot> mSlots;

    public boolean isCurrent() {
        return mCurrent;
    }

    public long getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public Set<RuneSlot> getSlots() {
        return mSlots;
    }
}
