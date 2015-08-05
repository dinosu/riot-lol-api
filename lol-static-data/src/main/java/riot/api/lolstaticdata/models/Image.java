package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class Image {
    @SerializedName("full")
    private String mFull;
    @SerializedName("group")
    private String mGroup;
    @SerializedName("sprite")
    private String mSprite;
    @SerializedName("h")
    private int mH;
    @SerializedName("w")
    private int mW;
    @SerializedName("x")
    private int mX;
    @SerializedName("y")
    private int mY;

    public String getFull() {
        return mFull;
    }

    public String getGroup() {
        return mGroup;
    }

    public String getSprite() {
        return mSprite;
    }

    public int getH() {
        return mH;
    }

    public int getW() {
        return mW;
    }

    public int getX() {
        return mX;
    }

    public int getY() {
        return mY;
    }
}