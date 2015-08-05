package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class BlockItem {
    @SerializedName("count")
    private int mCount;
    @SerializedName("id")
    private int mId;

    public int getCount() {
        return mCount;
    }

    public int getId() {
        return mId;
    }
}
