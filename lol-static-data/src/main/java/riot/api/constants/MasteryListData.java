package riot.api.constants;

public enum MasteryListData {
    ALL("all"),
    IMAGE("image"),
    PREREQ("prereq"),
    RANKS("ranks"),
    SANITIZED_DESCRIPTION("sanitizedDescription"),
    TREE("tree"),
    ;

    private String value;

    MasteryListData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}