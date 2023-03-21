public class English extends Version {
    public English() {
        super();
        this.head = "En Anglais : ";
    }
    
    @Override
    public String getTraduction(String inFrench) {
        return this.head + this.dictionary.get(inFrench);
    }
}