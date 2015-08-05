package riot.api.lolstatus.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Service {
    @SerializedName("incidents")
    private List<Incident> mIncidents;
    @SerializedName("name")
    private String mName;
    @SerializedName("slug")
    private String mSlug;
    @SerializedName("status")
    private String mStatus;

    public List<Incident> getIncidents() {
        return mIncidents;
    }

    public String getName() {
        return mName;
    }

    public String getSlug() {
        return mSlug;
    }

    public String getStatus() {
        return mStatus;
    }
}
