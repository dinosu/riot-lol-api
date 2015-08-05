package riot.api.match.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class Frame {
    @SerializedName("events")
    private List<Event> mEvents;
    @SerializedName("participantFrameMap")
    private Map<String, ParticipantFrame> mParticipantFrameMap;
    @SerializedName("timestamp")
    private long timestamp;

    public List<Event> getEvents() {
        return mEvents;
    }

    public Map<String, ParticipantFrame> getParticipantFrameMap() {
        return mParticipantFrameMap;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
