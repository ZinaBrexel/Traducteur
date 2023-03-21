public class Breton extends Version {
    public Breton() {
        super();
        this.head = "En Breton : ";
    }
    
    @Override
    public String getTraduction(String inFrench) {
        return this.head + this.dictionary.get(inFrench);
    }
}