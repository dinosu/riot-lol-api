package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class BasicData {
    @SerializedName("from")
    private List<String> mFrom;
    @SerializedName("into")
    private List<String> mInto;
    private Map<String, Boolean> maps;
    @SerializedName("tags")
    private List<String> mTags;
    @SerializedName("gold")
    private Gold mGold;
    @SerializedName("image")
    private Image mImage;
    @SerializedName("rune")
    private MetaData mRune;
    @SerializedName("stats")
    private BasicDataStats mStats;
    @SerializedName("colloq")
    private String mColloq;
    @SerializedName("decription")
    private String mDecription;
    @SerializedName("group")
    private String mGroup;
    @SerializedName("ame")
    private String mAme;
    @SerializedName("plaintext")
    private String mPlaintext;
    @SerializedName("requiredChampion")
    private String mRequiredChampion;
    @SerializedName("sanitizedDescription")
    private String mSanitizedDescription;
    @SerializedName("consumeOnFull")
    private boolean mConsumeOnFull;
    @SerializedName("consumed")
    private boolean mConsumed;
    @SerializedName("hideFromAll")
    private boolean mHideFromAll;
    @SerializedName("inStore")
    private boolean mInStore;
    @SerializedName("depth")
    private int mDepth;
    @SerializedName("id")
    private int mId;
    @SerializedName("specialRecipe")
    private int mSpecialRecipe;
    @SerializedName("stacks")
    private int mStacks;

    public List<String> getFrom() {
        return mFrom;
    }

    public List<String> getInto() {
        return mInto;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public List<String> getTags() {
        return mTags;
    }

    public Gold getGold() {
        return mGold;
    }

    public Image getImage() {
        return mImage;
    }

    public MetaData getRune() {
        return mRune;
    }

    public BasicDataStats getStats() {
        return mStats;
    }

    public String getColloq() {
        return mColloq;
    }

    public String getDecription() {
        return mDecription;
    }

    public String getGroup() {
        return mGroup;
    }

    public String getAme() {
        return mAme;
    }

    public String getPlaintext() {
        return mPlaintext;
    }

    public String getRequiredChampion() {
        return mRequiredChampion;
    }

    public String getSanitizedDescription() {
        return mSanitizedDescription;
    }

    public boolean isConsumeOnFull() {
        return mConsumeOnFull;
    }

    public boolean isConsumed() {
        return mConsumed;
    }

    public boolean isHideFromAll() {
        return mHideFromAll;
    }

    public boolean isInStore() {
        return mInStore;
    }

    public int getDepth() {
        return mDepth;
    }

    public int getId() {
        return mId;
    }

    public int getSpecialRecipe() {
        return mSpecialRecipe;
    }

    public int getStacks() {
        return mStacks;
    }
}
