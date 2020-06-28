import java.util.ArrayList;
import java.util.List;

public class ModelStore {

    private static final int MAX_LOAD = 10;

    private List<Model> models = new ArrayList<>();

    ModelStore() {
    }

    public void add(Model model) {
        if (models.size() < MAX_LOAD) {
            if (model != null) {
                models.add(model);
            } else {
                System.out.println("Model = null!");
            }
        } else {
            System.out.println("Store is full!");
        }
    }

    public Model get(String name) {
        if (models.size() > 0) {
            if (name != null) {
                for (int i = 0; i < models.size(); i++) {
                    if (models.get(i).getName().equals(name)) {
                        return models.remove(i);
                    } else {
                        System.out.println("Model with name = " + name + " not found!");
                        return null;
                    }
                }
            }
            else {
                System.out.println("Name = null!");
            }
        }
        else {
            System.out.println("ModelStore is empty!");
        }
        return null;
    }



}
