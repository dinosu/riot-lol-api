package io.github.andrew_su.eventbus;

public interface Bus {
    void subscribe(ISubscriber subscriber);

    void unsubscribe(ISubscriber unsubscriber);

    void post(BusEvent event);
}
