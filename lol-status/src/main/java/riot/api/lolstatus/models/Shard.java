package riot.api.lolstatus.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Shard {
    @SerializedName("locales")
    private List<String> mLocales;
    @SerializedName("hostname")
    private String mHostname;
    @SerializedName("name")
    private String mName;
    @SerializedName("region_tag")
    private String mRegion_tag;
    @SerializedName("slug")
    private String mSlug;

    public List<String> getLocales() {
        return mLocales;
    }

    public String getHostname() {
        return mHostname;
    }

    public String getName() {
        return mName;
    }

    public String getRegion_tag() {
        return mRegion_tag;
    }

    public String getSlug() {
        return mSlug;
    }
}
