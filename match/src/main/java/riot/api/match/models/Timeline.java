package riot.api.match.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Timeline {
    @SerializedName("frames")
    private List<Frame> mFrames;
    @SerializedName("frameInterval")
    private long mFrameInterval;

    public List<Frame> getFrames() {
        return mFrames;
    }

    public long getFrameInterval() {
        return mFrameInterval;
    }
}
