package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MasteryTreeList {
    @SerializedName("masteryTreeItems")
    private List<MasteryTreeItem> mMasteryTreeItems;

    public List<MasteryTreeItem> getMasteryTreeItems() {
        return mMasteryTreeItems;
    }
}
