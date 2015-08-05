package riot.api.constants;

import java.net.URI;

public enum Region {
    BR("br", "br.api.pvp.net", "BR1"),
    EUNE("eune", "eune.api.pvp.net", "EUNE1"),
    EUW("euw", "euw.api.pvp.net", "EUW"),
    KR("kr", "kr.api.pvp.net", "KE"),
    LAN("lan", "lan.api.pvp.net", "LA1"),
    LAS("las", "las.api.pvp.net", "LA2"),
    NA("na", "na.api.pvp.net", "NA1"),
    OCE("oce", "oce.api.pvp.net", "OC1"),
    TR("tr", "tr.api.pvp.net", "TR1"),
    RU("ru", "ru.api.pvp.net", "RU"),
    PBE("pbe", "global.api.pvp.net", "PBE1"),
    GLOBAL("global", "global.api.pvp.net", "");

    private final String mPlatformId;
    private final String mHost;
    private final String mName;

    Region(String name, String host, String platformId) {
        this.mHost = host;
        this.mName = name;
        this.mPlatformId = platformId;
    }

    public String getBase() {
        return "https://" + mHost;
    }

    public URI getRegionUri() {
        return URI.create(getBase());
    }

    public String getRegionId() {
        return mName;
    }

    public String getPlatformId() {
        return mPlatformId;
    }
}
