package riot.api.models.summoner;

import com.google.gson.annotations.SerializedName;

public class RuneSlot {
    @SerializedName("runeId")
    private int runeId;
    @SerializedName("runeSlotId")
    private int runeSlotId;

    public int getRuneId() {
        return runeId;
    }

    public int getRuneSlotId() {
        return runeSlotId;
    }
}
