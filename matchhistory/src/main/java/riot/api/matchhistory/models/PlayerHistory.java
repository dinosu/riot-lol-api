package riot.api.matchhistory.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlayerHistory {
    @SerializedName("matches")
    private List<MatchSummary> mMatches;

    public List<MatchSummary> getMatches() {
        return mMatches;
    }
}
