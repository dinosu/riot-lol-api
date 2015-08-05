package io.github.andrew_su.eventbus;

import java.util.List;

public interface ISubscriber {
    /**
     * To prevent memory leaks do not modify the list while object is registered.
     *
     * @return
     */
    List<Class<?>> getSubscribeEvents();

    void handleEvent(BusEvent<?> event);
}
