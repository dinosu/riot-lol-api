package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class MasteryTreeItem {
    @SerializedName("masteryId")
    private int mMasteryId;
    @SerializedName("prereq")
    private String mPrereq;

    public int getMasteryId() {
        return mMasteryId;
    }

    public String getPrereq() {
        return mPrereq;
    }
}
