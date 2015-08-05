package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Recommended {
    @SerializedName("blocks")
    private List<Block> mBlocks;
    @SerializedName("champion")
    private String mChampion;
    @SerializedName("map")
    private String mMap;
    @SerializedName("mode")
    private String mMode;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("type")
    private String mType;
    @SerializedName("priority")
    private boolean mPriority;

    public List<Block> getBlocks() {
        return mBlocks;
    }

    public String getChampion() {
        return mChampion;
    }

    public String getMap() {
        return mMap;
    }

    public String getMode() {
        return mMode;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getType() {
        return mType;
    }

    public boolean isPriority() {
        return mPriority;
    }
}