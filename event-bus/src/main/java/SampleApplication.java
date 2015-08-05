import io.github.andrew_su.eventbus.BusEvent;
import io.github.andrew_su.eventbus.DumbBus;
import io.github.andrew_su.eventbus.ISubscriber;

import java.util.Arrays;
import java.util.List;

public class SampleApplication implements ISubscriber {
    public static void main(String[] args) {
        SampleApplication sampleApplication = new SampleApplication();
        DumbBus bus = new DumbBus();
        bus.subscribe(sampleApplication);
        bus.post(new BusEvent<>(sampleApplication, SampleApplication.class));
        bus.unsubscribe(sampleApplication);
        bus.post(new BusEvent<>(sampleApplication, SampleApplication.class));
    }

    @Override
    public List<Class<?>> getSubscribeEvents() {
        return Arrays.<Class<?>>asList(SampleApplication.class);
    }

    @Override
    public void handleEvent(BusEvent<?> event) {
        System.out.println("event received " + event.getResult().getClass().getSimpleName());
    }
}
