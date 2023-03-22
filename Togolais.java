public class Togolais extends Version{
    public Togolais(){
        super();
        this.head = "En Togolais";
    }

    @Override
    public String getTraduction(String inFrench) {
        return this.head + this.dictionary.get(inFrench);
    }
}
