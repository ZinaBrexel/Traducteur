import java.util.HashMap;

public abstract class Version {
    protected HashMap<String, String> dictionary;
    protected String head;

    public Version() {
        this.dictionary = new HashMap<>();
    }

    public void addDictionary(String inFrench, String traduction) {
        this.dictionary.put(inFrench, traduction);
    }

    public String getTraduction(String inFrench) {
        return this.dictionary.get(inFrench);
    }
}
