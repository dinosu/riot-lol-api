package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class Rune {
    @SerializedName("from")
    private List<String> mFrom;
    @SerializedName("into")
    private List<String> mInto;
    @SerializedName("maps")
    private Map<String, Boolean> mMaps;
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
    @SerializedName("stat")
    private RuneStat mStat;
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
    @SerializedName("colloq")
    private String mColloq;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("group")
    private String mGroup;
    @SerializedName("name")
    private String mName;
    @SerializedName("plaintext")
    private String mPlaintext;
    @SerializedName("requiredChampion")
    private String mRequiredChampion;

    public List<String> getFrom() {
        return mFrom;
    }

    public List<String> getInto() {
        return mInto;
    }

    public Map<String, Boolean> getMaps() {
        return mMaps;
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

    public String getColloq() {
        return mColloq;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getGroup() {
        return mGroup;
    }

    public String getName() {
        return mName;
    }

    public String getPlaintext() {
        return mPlaintext;
    }

    public String getRequiredChampion() {
        return mRequiredChampion;
    }

    public RuneStat getStat() {
        if (mStat != null)
            return mStat;

        mStat = new RuneStat();
        double value;

        if ((value = mStats.getFlatArmorMod()) != 0) {
            mStat.setType("FlatArmorMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatAttackSpeedMod()) != 0) {
            mStat.setType("FlatAttackSpeedMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatBlockMod()) != 0) {
            mStat.setType("FlatBlockMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatCritChanceMod()) != 0) {
            mStat.setType("FlatCritChanceMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatCritDamageMod()) != 0) {
            mStat.setType("FlatCritDamageMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatEnergyPoolMod()) != 0) {
            mStat.setType("FlatEnergyPoolMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatEnergyRegenMod()) != 0) {
            mStat.setType("FlatEnergyRegenMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatEXPBonus()) != 0) {
            mStat.setType("FlatEXPBonus");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatHPPoolMod()) != 0) {
            mStat.setType("FlatHPPoolMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatHPRegenMod()) != 0) {
            mStat.setType("FlatHPRegenMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatMagicDamageMod()) != 0) {
            mStat.setType("FlatMagicDamageMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatMovementSpeedMod()) != 0) {
            mStat.setType("FlatMovementSpeedMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatMPPoolMod()) != 0) {
            mStat.setType("FlatMPPoolMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatMPRegenMod()) != 0) {
            mStat.setType("FlatMPRegenMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatPhysicalDamageMod()) != 0) {
            mStat.setType("FlatPhysicalDamageMod");
            mStat.setValue(value);
        } else if ((value = mStats.getFlatSpellBlockMod()) != 0) {
            mStat.setType("FlatSpellBlockMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentArmorMod()) != 0) {
            mStat.setType("PercentArmorMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentAttackSpeedMod()) != 0) {
            mStat.setType("PercentAttackSpeedMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentBlockMod()) != 0) {
            mStat.setType("PercentBlockMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentCritChanceMod()) != 0) {
            mStat.setType("PercentCritChanceMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentCritDamageMod()) != 0) {
            mStat.setType("PercentCritDamageMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentDodgeMod()) != 0) {
            mStat.setType("PercentDodgeMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentEXPBonus()) != 0) {
            mStat.setType("PercentEXPBonus");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentHPPoolMod()) != 0) {
            mStat.setType("PercentHPPoolMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentHPRegenMod()) != 0) {
            mStat.setType("PercentHPRegenMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentLifeStealMod()) != 0) {
            mStat.setType("PercentLifeStealMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentMagicDamageMod()) != 0) {
            mStat.setType("PercentMagicDamageMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentMovementSpeedMod()) != 0) {
            mStat.setType("PercentMovementSpeedMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentMPPoolMod()) != 0) {
            mStat.setType("PercentMPPoolMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentMPRegenMod()) != 0) {
            mStat.setType("PercentMPRegenMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentPhysicalDamageMod()) != 0) {
            mStat.setType("PercentPhysicalDamageMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentSpellBlockMod()) != 0) {
            mStat.setType("PercentSpellBlockMod");
            mStat.setValue(value);
        } else if ((value = mStats.getPercentSpellVampMod()) != 0) {
            mStat.setType("PercentSpellVampMod");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatArmorModPerLevel()) != 0) {
            mStat.setType("rFlatArmorModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatArmorPenetrationMod()) != 0) {
            mStat.setType("rFlatArmorPenetrationMod");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatArmorPenetrationMod()) != 0) {
            mStat.setType("rFlatArmorPenetrationModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatCritChanceModPerLevel()) != 0) {
            mStat.setType("rFlatCritChanceModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatCritDamageModPerLevel()) != 0) {
            mStat.setType("rFlatCritDamageModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatDodgeMod()) != 0) {
            mStat.setType("rFlatDodgeMod");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatDodgeMod()) != 0) {
            mStat.setType("rFlatDodgeModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatEnergyModPerLevel()) != 0) {
            mStat.setType("rFlatEnergyModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatEnergyRegenModPerLevel()) != 0) {
            mStat.setType("rFlatEnergyRegenModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatGoldPer10Mod()) != 0) {
            mStat.setType("rFlatGoldPer10Mod");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatHPModPerLevel()) != 0) {
            mStat.setType("rFlatHPModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatHPRegenModPerLevel()) != 0) {
            mStat.setType("rFlatHPRegenModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatMagicDamageModPerLevel()) != 0) {
            mStat.setType("rFlatMagicDamageModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatMagicPenetrationMod()) != 0) {
            mStat.setType("rFlatMagicPenetrationMod");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatMagicPenetrationMod()) != 0) {
            mStat.setType("rFlatMagicPenetrationModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatMovementSpeedModPerLevel()) != 0) {
            mStat.setType("rFlatMovementSpeedModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatMPModPerLevel()) != 0) {
            mStat.setType("rFlatMPModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatMPRegenModPerLevel()) != 0) {
            mStat.setType("rFlatMPRegenModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatPhysicalDamageModPerLevel()) != 0) {
            mStat.setType("rFlatPhysicalDamageModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatSpellBlockModPerLevel()) != 0) {
            mStat.setType("rFlatSpellBlockModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatTimeDeadMod()) != 0) {
            mStat.setType("rFlatTimeDeadMod");
            mStat.setValue(value);
        } else if ((value = mStats.getRFlatTimeDeadMod()) != 0) {
            mStat.setType("rFlatTimeDeadModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRPercentArmorPenetrationMod()) != 0) {
            mStat.setType("rPercentArmorPenetrationMod");
            mStat.setValue(value);
        } else if ((value = mStats.getRPercentArmorPenetrationMod()) != 0) {
            mStat.setType("rPercentArmorPenetrationModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRPercentAttackSpeedModPerLevel()) != 0) {
            mStat.setType("rPercentAttackSpeedModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRPercentCooldownMod()) != 0) {
            mStat.setType("rPercentCooldownMod");
            mStat.setValue(value);
        } else if ((value = mStats.getRPercentCooldownMod()) != 0) {
            mStat.setType("rPercentCooldownModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRPercentMagicPenetrationMod()) != 0) {
            mStat.setType("rPercentMagicPenetrationMod");
            mStat.setValue(value);
        } else if ((value = mStats.getRPercentMagicPenetrationMod()) != 0) {
            mStat.setType("rPercentMagicPenetrationModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRPercentMovementSpeedModPerLevel()) != 0) {
            mStat.setType("rPercentMovementSpeedModPerLevel");
            mStat.setValue(value);
        } else if ((value = mStats.getRPercentTimeDeadMod()) != 0) {
            mStat.setType("rPercentTimeDeadMod");
            mStat.setValue(value);
        } else if ((value = mStats.getRPercentTimeDeadMod()) != 0) {
            mStat.setType("rPercentTimeDeadModPerLevel");
            mStat.setValue(value);
        }
        return mStat;
    }
}
