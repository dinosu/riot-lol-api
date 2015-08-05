package riot.api.champion.models;

import com.google.gson.annotations.SerializedName;

public class Champion {
    @SerializedName("id")
    private long mId;
    @SerializedName("active")
    private boolean mActive;
    @SerializedName("botEnabled")
    private boolean mBotEnabled;
    @SerializedName("botMmEnabled")
    private boolean mBotMatchMadeEnabled;
    @SerializedName("freeToPlay")
    private boolean mFreeToPlay;
    @SerializedName("rankedPlayEnabled")
    private boolean mRankedPlayEnabled;

    public long getId() {
        return mId;
    }

    public boolean isActive() {
        return mActive;
    }

    public boolean isBotEnabled() {
        return mBotEnabled;
    }

    public boolean isBotMatchMadeEnabled() {
        return mBotMatchMadeEnabled;
    }

    public boolean isFreeToPlay() {
        return mFreeToPlay;
    }

    public boolean isRankedPlayEnabled() {
        return mRankedPlayEnabled;
    }
}
