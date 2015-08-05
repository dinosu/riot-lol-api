package riot.api.featuredgames.models;

import com.google.gson.annotations.SerializedName;

public class Observer {
    @SerializedName("encryptionKey")
    private String mEncryptionKey;

    public String getEncryptionKey() {
        return mEncryptionKey;
    }
}
