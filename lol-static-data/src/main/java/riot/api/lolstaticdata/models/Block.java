package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Block {
    @SerializedName("items")
    private List<BlockItem> mItems;
    @SerializedName("recMath")
    private boolean mRecMath;
    @SerializedName("type")
    private String mType;

    public List<BlockItem> getItems() {
        return mItems;
    }

    public boolean isRecMath() {
        return mRecMath;
    }

    public String getType() {
        return mType;
    }
}
