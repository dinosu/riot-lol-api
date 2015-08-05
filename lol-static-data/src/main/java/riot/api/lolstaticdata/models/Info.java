package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class Info {
    @SerializedName("attack")
    private int mAttack;
    @SerializedName("defense")
    private int mDefense;
    @SerializedName("difficulty")
    private int mDifficulty;
    @SerializedName("magic")
    private int mMagic;

    public int getAttack() {
        return mAttack;
    }

    public int getDefense() {
        return mDefense;
    }

    public int getDifficulty() {
        return mDifficulty;
    }

    public int getMagic() {
        return mMagic;
    }
}
