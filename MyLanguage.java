public enum MyLanguage {
    LANGUAGE1("Anglais"),
    LANGUAGE2("Breton");

    private final String displayName;

    MyLanguage(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
