package io.github.andrew_su.eventbus;

public class BusEvent<T> {
    private final T mResult;
    private final Class<T> mClass;

    public BusEvent(final T result, final Class<T> clazz) {
        mResult = result;
        mClass = clazz;
    }

    public T getResult() {
        return mResult;
    }

    Class<T> getEventClass() {
        return mClass;
    }
}
