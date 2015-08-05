package riot.api.constants;

public enum RuneListData {
    ALL("all"),
    BASIC("basic"),
    COLLOQ("colloq"),
    CONSUME_ON_FULL("consumeOnFull"),
    CONSUMED("consumed"),
    DEPTH("depth"),
    FROM("from"),
    GOLD("gold"),
    HIDE_FROM_ALL("hideFromAll"),
    IMAGE("image"),
    IN_STORE("inStore"),
    INTO("into"),
    MAPS("maps"),
    REQUIRED_CHAMPION("requiredChampion"),
    SANITIZED_DESCRIPTION("sanitizedDescription"),
    SPECIAL_RECIPE("specialRecipe"),
    STACKS("stacks"),
    STATS("stats"),
    TAGS("tags"),
    ;

    private String value;

    RuneListData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
