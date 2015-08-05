package riot.api.lolstatus.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ShardStatus {
    @SerializedName("locales")
    private List<String> mLocales;
    @SerializedName("services")
    private List<Service> mServices;
    @SerializedName("hostname")
    private String mHostname;
    @SerializedName("name")
    private String mName;
    @SerializedName("region_tag")
    private String mRegion_tag;
    @SerializedName("slug")
    private String mSlug;
}
