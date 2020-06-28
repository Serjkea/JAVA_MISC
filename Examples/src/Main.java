import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static final List<Model> models = new ArrayList<>();

    public static void main(String[] args) {
        models.add(new Model("bread","25"));
        models.add(new Model("milk","50"));
        models.add(new Model("juice","80"));
        models.add(new Model("sugar","35"));
        models.forEach(System.out::println);
    }

}
