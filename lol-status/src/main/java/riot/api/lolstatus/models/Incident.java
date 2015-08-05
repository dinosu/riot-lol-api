package riot.api.lolstatus.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Incident {
    @SerializedName("active")
    private boolean mActive;
    @SerializedName("created_at")
    private String mCreated_at;
    @SerializedName("id")
    private long mId;
    @SerializedName("updates")
    private List<Message> mUpdates;

    public boolean isActive() {
        return mActive;
    }

    public String getCreated_at() {
        return mCreated_at;
    }

    public long getId() {
        return mId;
    }

    public List<Message> getUpdates() {
        return mUpdates;
    }
}
