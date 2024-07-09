public class Fauna extends Databank {

    public Fauna(String group, String name, String classification, String category, String obtainableFrom) {
        super(group, name, classification, category, obtainableFrom);
    }

    @Override
    public String toString() {
        return "\tGroup: " + getGroup() + "\n\tName: " + getName() + "\n\tClassification: " + getClassification() + "\n\tCategory: " + getCategory() + "\n\tObtainable From: " + getObtainableFrom() + "\n";
        
    }
    
}
