package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Champion {
    @SerializedName("allytips")
    private List<String> mAllytips;
    @SerializedName("enemytips")
    private List<String> mEnemytips;
    @SerializedName("recommended")
    private List<Recommended> mRecommended;
    @SerializedName("skins")
    private List<Skin> mSkins;
    @SerializedName("spells")
    private List<ChampionSpell> mSpells;
    @SerializedName("tags")
    private List<String> mTags;
    @SerializedName("image")
    private Image mImage;
    @SerializedName("info")
    private Info mInfo;
    @SerializedName("passive")
    private Passive mPassive;
    @SerializedName("stats")
    private Stats mStats;
    @SerializedName("id")
    private int mId;
    @SerializedName("blurb")
    private String mBlurb;
    @SerializedName("key")
    private String mKey;
    @SerializedName("lore")
    private String mLore;
    @SerializedName("name")
    private String mName;
    @SerializedName("partype")
    private String mPartype;
    @SerializedName("title")
    private String mTitle;

    public List<String> getAllytips() {
        return mAllytips;
    }

    public List<String> getEnemytips() {
        return mEnemytips;
    }

    public List<Recommended> getRecommended() {
        return mRecommended;
    }

    public List<Skin> getSkins() {
        return mSkins;
    }

    public List<ChampionSpell> getSpells() {
        return mSpells;
    }

    public List<String> getTags() {
        return mTags;
    }

    public Image getImage() {
        return mImage;
    }

    public Info getInfo() {
        return mInfo;
    }

    public Passive getPassive() {
        return mPassive;
    }

    public Stats getStats() {
        return mStats;
    }

    public int getId() {
        return mId;
    }

    public String getBlurb() {
        return mBlurb;
    }

    public String getKey() {
        return mKey;
    }

    public String getLore() {
        return mLore;
    }

    public String getName() {
        return mName;
    }

    public String getPartype() {
        return mPartype;
    }

    public String getTitle() {
        return mTitle;
    }
}
