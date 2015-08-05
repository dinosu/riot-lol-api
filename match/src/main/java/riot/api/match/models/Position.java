package riot.api.match.models;

import com.google.gson.annotations.SerializedName;

public class Position {
    @SerializedName("x")
    private int mX;
    @SerializedName("y")
    private int mY;

    public int getX() {
        return mX;
    }

    public int getY() {
        return mY;
    }
}
