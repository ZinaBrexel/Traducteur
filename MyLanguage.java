public enum MyLanguage {
    ANGLAIS("Langue 1"),
    BRETON("Langue 2"),
    TOGOLAIS("Langue 3");

    private final String displayName;

    MyLanguage(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
