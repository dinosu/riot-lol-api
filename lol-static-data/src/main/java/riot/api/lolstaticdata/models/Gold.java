package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class Gold {
    @SerializedName("purchasable")
    private boolean mPurchasable;
    @SerializedName("base")
    private int mBase;
    @SerializedName("sell")
    private int mSell;
    @SerializedName("total")
    private int mTotal;

    public boolean isPurchasable() {
        return mPurchasable;
    }

    public int getBase() {
        return mBase;
    }

    public int getSell() {
        return mSell;
    }

    public int getTotal() {
        return mTotal;
    }
}
