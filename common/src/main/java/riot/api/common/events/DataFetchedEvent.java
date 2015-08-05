package riot.api.common.events;

public class DataFetchedEvent<T> {
    private final T mResult;

    public DataFetchedEvent(T result) {
        mResult = result;
    }

    public T getResult() {
        return mResult;
    }
}
