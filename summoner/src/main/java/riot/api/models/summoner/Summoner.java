package riot.api.models.summoner;

import com.google.gson.annotations.SerializedName;

public class Summoner {
    @SerializedName("id")
    private long id;
    @SerializedName("revisionDate")
    private long revisionDate;
    @SerializedName("summonerLevel")
    private long summonerLevel;
    @SerializedName("profileIconId")
    private int profileIconId;
    @SerializedName("name")
    private String name;

    public long getId() {
        return id;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public String getName() {
        return name;
    }
}
