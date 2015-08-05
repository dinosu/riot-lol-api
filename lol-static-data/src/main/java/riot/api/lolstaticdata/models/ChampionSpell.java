package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChampionSpell {
    @SerializedName("altimages")
    private List<Image> mAltimages;
    @SerializedName("cooldown")
    private List<Double> mCooldown;
    @SerializedName("cost")
    private List<Integer> mCost;
    @SerializedName("effect")
    private List<Object> mEffect;
    @SerializedName("effectBurn")
    private List<String> mEffectBurn;
    @SerializedName("range")
    private Object mRange;
    @SerializedName("vars")
    private List<SpellVars> mVars;
    @SerializedName("cooldownBurn")
    private String mCooldownBurn;
    @SerializedName("costBurn")
    private String mCostBurn;
    @SerializedName("costType")
    private String mCostType;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("key")
    private String mKey;
    @SerializedName("name")
    private String mName;
    @SerializedName("rangeBurn")
    private String mRangeBurn;
    @SerializedName("resource")
    private String mResource;
    @SerializedName("sanitizedDescription")
    private String mSanitizedDescription;
    @SerializedName("sanitizedTooltip")
    private String mSanitizedTooltip;
    @SerializedName("tooltip")
    private String mTooltip;
    @SerializedName("image")
    private Image mImage;
    @SerializedName("maxrank")
    private int mMaxrank;

    public List<Image> getAltimages() {
        return mAltimages;
    }

    public List<Double> getCooldown() {
        return mCooldown;
    }

    public List<Integer> getCost() {
        return mCost;
    }

    public List<Object> getEffect() {
        return mEffect;
    }

    public List<String> getEffectBurn() {
        return mEffectBurn;
    }

    public Object getRange() {
        return mRange;
    }

    public List<SpellVars> getVars() {
        return mVars;
    }

    public String getCooldownBurn() {
        return mCooldownBurn;
    }

    public String getCostBurn() {
        return mCostBurn;
    }

    public String getCostType() {
        return mCostType;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getKey() {
        return mKey;
    }

    public String getName() {
        return mName;
    }

    public String getRangeBurn() {
        return mRangeBurn;
    }

    public String getResource() {
        return mResource;
    }

    public String getSanitizedDescription() {
        return mSanitizedDescription;
    }

    public String getSanitizedTooltip() {
        return mSanitizedTooltip;
    }

    public String getTooltip() {
        return mTooltip;
    }

    public Image getImage() {
        return mImage;
    }

    public int getMaxrank() {
        return mMaxrank;
    }
}
