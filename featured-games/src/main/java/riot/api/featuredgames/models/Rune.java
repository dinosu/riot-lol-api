package riot.api.featuredgames.models;

import com.google.gson.annotations.SerializedName;

public class Rune {
    @SerializedName("count")
    private int mCount;
    @SerializedName("runeId")
    private long mRuneId;

    public int getCount() {
        return mCount;
    }

    public long getRuneId() {
        return mRuneId;
    }
}
