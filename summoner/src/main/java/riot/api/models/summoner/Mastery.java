package riot.api.models.summoner;

import com.google.gson.annotations.SerializedName;

public class Mastery {
    @SerializedName("rank")
    private int mRank;
    @SerializedName("id")
    private long mId;

    public int getRank() {
        return mRank;
    }

    public long getId() {
        return mId;
    }
}
