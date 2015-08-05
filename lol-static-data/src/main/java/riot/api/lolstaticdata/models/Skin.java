package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class Skin {
    @SerializedName("id")
    private int mId;
    @SerializedName("num")
    private int mNum;
    @SerializedName("name")
    private String mName;

    public int getId() {
        return mId;
    }

    public int getNum() {
        return mNum;
    }

    public String getName() {
        return mName;
    }
}
