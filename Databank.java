public abstract class Databank {
    private String group;
    private String name;
    private String classification;
    private String category;
    private String obtainableFrom;

    public Databank(String group,String name, String classification, String category, String obtainableFrom)
    {
        this.group = group;
        this.name = name;
        this.classification = classification;
        this.category = category;
        this.obtainableFrom = obtainableFrom;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getObtainableFrom() {
        return obtainableFrom;
    }

    public void setObtainableFrom(String obtainableFrom) {
        this.obtainableFrom = obtainableFrom;
    }

    public abstract String toString();
    
    
}