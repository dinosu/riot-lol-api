package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class Stats {
    @SerializedName("armor")
    private double mArmor;
    @SerializedName("armorperlevel")
    private double mArmorperlevel;
    @SerializedName("attackdamage")
    private double mAttackdamage;
    @SerializedName("attackdamageperlevel")
    private double mAttackdamageperlevel;
    @SerializedName("attackrange")
    private double mAttackrange;
    @SerializedName("attackspeedoffset")
    private double mAttackspeedoffset;
    @SerializedName("attackspeedperlevel")
    private double mAttackspeedperlevel;
    @SerializedName("crit")
    private double mCrit;
    @SerializedName("critperlevel")
    private double mCritperlevel;
    @SerializedName("hp")
    private double mHp;
    @SerializedName("hpperlevel")
    private double mHpperlevel;
    @SerializedName("hpregen")
    private double mHpregen;
    @SerializedName("hpregenperlevel")
    private double mHpregenperlevel;
    @SerializedName("movespeed")
    private double mMovespeed;
    @SerializedName("mp")
    private double mMp;
    @SerializedName("mpperlevel")
    private double mMpperlevel;
    @SerializedName("mpregen")
    private double mMpregen;
    @SerializedName("mpregenperlevel")
    private double mMpregenperlevel;
    @SerializedName("spellblock")
    private double mSpellblock;
    @SerializedName("spellblockperlevel")
    private double mSpellblockperlevel;

    public double getBaseAttackSpeed() {
        return (0.625 / (1.0 + mAttackspeedoffset));
    }

    public double getArmor() {
        return mArmor;
    }

    public double getArmorperlevel() {
        return mArmorperlevel;
    }

    public double getAttackdamage() {
        return mAttackdamage;
    }

    public double getAttackdamageperlevel() {
        return mAttackdamageperlevel;
    }

    public double getAttackrange() {
        return mAttackrange;
    }

    public double getAttackspeedoffset() {
        return mAttackspeedoffset;
    }

    public double getAttackspeedperlevel() {
        return mAttackspeedperlevel;
    }

    public double getCrit() {
        return mCrit;
    }

    public double getCritperlevel() {
        return mCritperlevel;
    }

    public double getHp() {
        return mHp;
    }

    public double getHpperlevel() {
        return mHpperlevel;
    }

    public double getHpregen() {
        return mHpregen;
    }

    public double getHpregenperlevel() {
        return mHpregenperlevel;
    }

    public double getMovespeed() {
        return mMovespeed;
    }

    public double getMp() {
        return mMp;
    }

    public double getMpperlevel() {
        return mMpperlevel;
    }

    public double getMpregen() {
        return mMpregen;
    }

    public double getMpregenperlevel() {
        return mMpregenperlevel;
    }

    public double getSpellblock() {
        return mSpellblock;
    }

    public double getSpellblockperlevel() {
        return mSpellblockperlevel;
    }
}
