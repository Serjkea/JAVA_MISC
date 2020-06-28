import model.Gender;
import model.Property;
import model.User;
import repository.UserStore;

public class DataCenter {

    private UserStore userStore;

    DataCenter() {
        this.userStore = new UserStore();
        userStore.addUser(new User("Bob","Houston",30, Gender.MALE,"USA","Chicago","Fox str, 250"));
        userStore.addUser(new User("Mike","Johnson",40, Gender.MALE,"Germany","Berlin","DFGR str, 40", new Property("house","concrete")));
        userStore.addUser(new User("Sergey","Nikolaev",25, Gender.MALE,"Russia","Moscow","Moiseev str, 50", new Property("car","kia")));
        userStore.addUser(new User("Nikola","Tesla",43, Gender.MALE,"Slovakia","Belgrif","Garslov str, 31"));
        userStore.addUser(new User("Kate","Rayan",32, Gender.FEMALE,"England","London","Central str, 30", new Property("car","peugeot")));
    }

    public static void main(String[] args) {
        DataCenter dataCenter = new DataCenter();
        System.out.println("Welcome to DataCenter!");
        System.out.println(dataCenter.userStore.getUserById(0));
        System.out.println(dataCenter.userStore.getUserById(0).getAddress());
        System.out.println(dataCenter.userStore.getUserById(1));
        System.out.println(dataCenter.userStore.getUserById(2));
        System.out.println(dataCenter.userStore.getUserById(3));
        System.out.println(dataCenter.userStore.getUserById(4));

    }

}
