package riot.api.lolstatus.models;

import com.google.gson.annotations.SerializedName;

public class Translation {
    @SerializedName("content")
    private String mContent;
    @SerializedName("locale")
    private String mLocale;
    @SerializedName("updated_at")
    private String mUpdated_at;

    public String getContent() {
        return mContent;
    }

    public String getLocale() {
        return mLocale;
    }

    public String getUpdated_at() {
        return mUpdated_at;
    }
}