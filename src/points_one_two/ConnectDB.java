package points_one_two;
import poins_one_one.*; // import difference package
public class ConnectDB  {
    public static void main(String[] args) {
        System.out.println("these are information from anther class");
        System.out.println(new Database().getHost());
        System.out.println(new Database().getUser());
        System.out.println(new Database().getPass());
        System.out.println(new Database().getDatabaseName());
        System.out.println(new Database().getPort());
    }
}


