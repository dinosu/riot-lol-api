package riot.api.common;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;
import riot.api.constants.Region;

import java.net.URI;

public class RiotRequestBuilder {
    private final HttpUrl.Builder mHttpUrlBuilder;

    public RiotRequestBuilder(Region region, String path) {
        URI uri = region.getRegionUri();
        mHttpUrlBuilder = new HttpUrl.Builder();
        mHttpUrlBuilder.scheme(uri.getScheme());
        mHttpUrlBuilder.host(uri.getHost());
        for (String p : path.split("/")) {
            mHttpUrlBuilder.addPathSegment(p);
        }
        mHttpUrlBuilder.addQueryParameter("api_key", "56fe697d-5913-42da-9569-3ee2aa9917fa");
    }

    public RiotRequestBuilder addQueryParameter(String key, String value) {
        mHttpUrlBuilder.addQueryParameter(key, value);
        return this;
    }

    public Request build() {
        return new Request.Builder().url(mHttpUrlBuilder.build()).build();
    }
}
