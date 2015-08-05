package riot.api.lolstaticdata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GameMap {
    @SerializedName("mapId")
    private int mMapId;
    @SerializedName("unpurchasableItemList")
    private List<Integer> mUnpurchasableItemList;
    @SerializedName("image")
    private Image mImage;
    @SerializedName("mapName")
    private String mMapName;

    public int getMapId() {
        return mMapId;
    }

    public List<Integer> getUnpurchasableItemList() {
        return mUnpurchasableItemList;
    }

    public Image getImage() {
        return mImage;
    }

    public String getMapName() {
        return mMapName;
    }
}
