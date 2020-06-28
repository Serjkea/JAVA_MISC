public class Model {

    private static int id_counter = 0;
    private int id;
    private String name;
    private String property;

    public Model() {
        this.id = ++id_counter;
        this.name = "unnamed";
        this.property = "unknown";
    }

    public Model(String name, String property) {
        this.id = ++id_counter;
        this.name = name;
        this.property = property;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getProperty() {
        return this.property;
    }

    public int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id*31 + this.name.hashCode() + this.property.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (obj == this) return true;
        else if (obj instanceof Model) {
            Model tmp = (Model) obj;
            return (tmp.getId() == this.id) &&
                   (tmp.getName().equals(this.name)) &&
                   (tmp.getProperty().equals(this.property));
        } else return false;
    }

    public String toString() {
        return "[id: " + this.id + ", name: " + this.name + ", property: " + this.property + "] ";
    }

}
