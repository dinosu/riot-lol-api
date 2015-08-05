package riot.api.league.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class League {
    @SerializedName("entries")
    private List<LeagueEntry> mEntries;
    @SerializedName("name")
    private String mName;
    @SerializedName("queue")
    private String mQueue;
    @SerializedName("tier")
    private String mTier;
    @SerializedName("participantId")
    private String mParticipantId;

    public List<LeagueEntry> getEntries() {
        return mEntries;
    }

    public String getName() {
        return mName;
    }

    public String getQueue() {
        return mQueue;
    }

    public String getTier() {
        return mTier;
    }

    public String getParticipantId() {
        return mParticipantId;
    }
}
