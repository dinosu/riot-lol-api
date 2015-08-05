package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Mastery {
    @SerializedName("description")
    private List<String> mDescription;
    @SerializedName("sanitizedDescription")
    private List<String> mSanitizedDescription;
    @SerializedName("image")
    private Image mImage;
    @SerializedName("id")
    private int mId;
    @SerializedName("ranks")
    private int mRanks;
    @SerializedName("name")
    private String mName;
    @SerializedName("prereq")
    private String mPrereq;
    @SerializedName("masteryTree")
    private String mMasteryTree;

    public List<String> getDescription() {
        return mDescription;
    }

    public List<String> getSanitizedDescription() {
        return mSanitizedDescription;
    }

    public Image getImage() {
        return mImage;
    }

    public int getId() {
        return mId;
    }

    public int getRanks() {
        return mRanks;
    }

    public String getName() {
        return mName;
    }

    public String getPrereq() {
        return mPrereq;
    }

    /**
     * Legal values: Defense, Offense, Utility
     */
    public String getMasteryTree() {
        return mMasteryTree;
    }

}
