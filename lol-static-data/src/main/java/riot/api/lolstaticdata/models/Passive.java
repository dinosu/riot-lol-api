package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

public class Passive {
    @SerializedName("description")
    private String mDescription;
    @SerializedName("name")
    private String mName;
    @SerializedName("sanitizedDescription")
    private String mSanitizedDescription;
    @SerializedName("image")
    private Image mImage;

    public String getDescription() {
        return mDescription;
    }

    public String getName() {
        return mName;
    }

    public String getSanitizedDescription() {
        return mSanitizedDescription;
    }

    public Image getImage() {
        return mImage;
    }
}
