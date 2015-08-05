package riot.api.constants;

public enum ChampData {
    ALL("all"),
    ALLYTIPS("allytips"),
    ALTIMAGES("altimages"),
    BLURB("blurb"),
    ENEMYTIPS("enemytips"),
    IMAGE("image"),
    INFO("info"),
    LORE("lore"),
    PARTYPE("partype"),
    PASSIVE("passive"),
    RECOMMENDED("recommended"),
    SKINS("skins"),
    SPELLS("spells"),
    STATS("stats"),
    TAGS("tags"),
    ;

    private String value;

    ChampData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
