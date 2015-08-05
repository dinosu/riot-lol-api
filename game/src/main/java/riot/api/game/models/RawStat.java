package riot.api.game.models;

import com.google.gson.annotations.SerializedName;

public class RawStat {
    @SerializedName("id")
    private int mId;
    @SerializedName("value")
    private int mValue;
    @SerializedName("name")
    private String mName;

    public int getId() {
        return mId;
    }

    public int getValue() {
        return mValue;
    }

    public String getName() {
        return mName;
    }
}
