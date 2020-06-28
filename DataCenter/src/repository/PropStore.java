package repository;

import model.Property;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PropStore {

    private List<Property> props = new ArrayList<>();

    public PropStore() {
    }

    public PropStore(List<Property> props) {
        this.props = props;
    }

    public void addProperty(Property property) {
        if (property != null) {
            this.props.add(property);
        } else {
            System.out.println("Error: property");
        }
    }

    public Property getPropertyByIndex(int index) {
        return props.get(index);
    }

    public Property getPropertyByName(String name) {
        if (name != null) {
            for(int i = 0; i < props.size(); i++) {
                if (props.get(i).getName().equals(name)) return props.get(i);
            }
        } else {
            System.out.println("Error: property not found");
            return null;
        } return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropStore propStore = (PropStore) o;
        return Objects.equals(props, propStore.props);
    }

    @Override
    public int hashCode() {
        return Objects.hash(props);
    }

}
