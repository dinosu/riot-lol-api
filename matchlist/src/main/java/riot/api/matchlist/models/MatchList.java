package riot.api.matchlist.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchList {
    @SerializedName("endIndex")
    private int mChampion;
    @SerializedName("matches")
    private List<MatchReference> mMatches;
    @SerializedName("startIndex")
    private int mStartIndex;
    @SerializedName("totalGames")
    private int mTotalGames;

    public int getChampion() {
        return mChampion;
    }

    public List<MatchReference> getMatches() {
        return mMatches;
    }

    public int getStartIndex() {
        return mStartIndex;
    }

    public int getTotalGames() {
        return mTotalGames;
    }
}
