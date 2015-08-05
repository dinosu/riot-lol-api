package riot.api.common;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import io.github.andrew_su.eventbus.Bus;
import io.github.andrew_su.eventbus.BusEvent;

import javax.inject.Inject;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RequestService {
    private final Executor mExecutor;
    private final OkHttpClient mHttpClient;
    private final Gson mGson;
    private final Bus mBus;

    @Inject
    public RequestService(OkHttpClient httpClient, Gson gson, Bus bus) {
        mGson = gson;
        mExecutor = Executors.newCachedThreadPool();
        mHttpClient = httpClient;
        mBus = bus;
    }

    public <T> T execute(Request request, Class<T> cls) throws IOException {
        System.out.println(request.httpUrl().toString());
        String responseBody = mHttpClient.newCall(request).execute().body().string();
        System.out.println(responseBody);
        return mGson.fromJson(responseBody, cls);
    }

    public <T> void executeAsync(final Request request, final Class<T> cls) {
        mExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    T response = execute(request, cls);
                    mBus.post(new BusEvent<T>(response, cls));
                } catch (IOException e) {
                    mBus.post(new BusEvent<T>(null, cls));
                }
            }
        });
    }
}
