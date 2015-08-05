package riot.api.lolstatus.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Message {
    @SerializedName("translations")
    private List<Translation> mTranslations;
    @SerializedName("author")
    private String mAuthor;
    @SerializedName("content")
    private String mContent;
    @SerializedName("created_at")
    private String mCreated_at;
    @SerializedName("severity")
    private String mSeverity;
    @SerializedName("updated_at")
    private String mUpdated_at;
    @SerializedName("id")
    private long mId;

    public List<Translation> getTranslations() {
        return mTranslations;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getContent() {
        return mContent;
    }

    public String getCreated_at() {
        return mCreated_at;
    }

    public String getSeverity() {
        return mSeverity;
    }

    public String getUpdated_at() {
        return mUpdated_at;
    }

    public long getId() {
        return mId;
    }
}
