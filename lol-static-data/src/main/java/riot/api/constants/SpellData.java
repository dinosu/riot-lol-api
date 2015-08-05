package riot.api.constants;

public enum SpellData {
    ALL("all"),
    COOLDOWN("cooldown"),
    COOLDOWN_BURN("cooldownBurn"),
    COST("cost"),
    COST_BURN("costBurn"),
    COST_TYPE("costType"),
    EFFECT("effect"),
    EFFECT_BURN("effectBurn"),
    IMAGE("image"),
    KEY("key"),
    LEVELTIP("leveltip"),
    MAXRANK("maxrank"),
    MODES("modes"),
    RANGE("range"),
    RANGE_BURN("rangeBurn"),
    RESOURCE("resource"),
    SANITIZED_DESCRIPTION("sanitizedDescription"),
    SANITIZED_TOOLTIP("sanitizedTooltip"),
    TOOLTIP("tooltip"),
    VARS("vars"),
    ;

    private String value;

    SpellData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
