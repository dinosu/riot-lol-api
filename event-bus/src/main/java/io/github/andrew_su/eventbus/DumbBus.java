package io.github.andrew_su.eventbus;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DumbBus implements Bus {
    private final HashMap<Class<?>, HashSet<ISubscriber>> mSubscribers = new HashMap<>();

    public synchronized void subscribe(ISubscriber subscriber) {
        List<Class<?>> eventTypes = subscriber.getSubscribeEvents();
        if (eventTypes != null && !eventTypes.isEmpty()) {
            for (Class cls : eventTypes) {
                HashSet<ISubscriber> set = mSubscribers.get(cls);
                if (set == null) {
                    set = new HashSet<>();
                    mSubscribers.put(cls, set);
                }
                set.add(subscriber);
            }
        } else {
            System.out.println("There are no event type this class is subscribed to.");
        }
    }

    public synchronized void post(BusEvent event) {
        if (event == null) {
            throw new IllegalArgumentException("Event can not be null");
        }
        HashSet<ISubscriber> subscribers = mSubscribers.get(event.getEventClass());
        if (subscribers != null && !subscribers.isEmpty()) {
            for (ISubscriber subscriber : subscribers) {
                subscriber.handleEvent(event);
            }
        } else {
            System.out.println("No subscribers found.");
        }
    }

    public synchronized void unsubscribe(ISubscriber unsubscriber) {
        List<Class<?>> eventTypes = unsubscriber.getSubscribeEvents();
        if (eventTypes != null && !eventTypes.isEmpty()) {
            for (Class cls : eventTypes) {
                HashSet<ISubscriber> set = mSubscribers.get(cls);
                if (set != null) {
                    set.remove(unsubscriber);
                }
            }
        }
    }
}
