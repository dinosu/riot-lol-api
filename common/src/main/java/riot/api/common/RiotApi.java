package riot.api.common;

public abstract class RiotApi {
    private final RequestService mRequestService;

    public RiotApi(RequestService requestService) {
        mRequestService = requestService;
    }

    public RequestService getRequestService() {
        return mRequestService;
    }

    public abstract String getVersion();
}
