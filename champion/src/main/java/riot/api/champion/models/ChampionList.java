package riot.api.champion.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChampionList {
    @SerializedName("champions")
    private List<Champion> mChampions;

    public List<Champion> getChampions() {
        return mChampions;
    }
}
