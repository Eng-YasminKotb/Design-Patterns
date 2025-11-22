import Singleton.Eager.Config;
import Singleton.Lazy.DBConnection;

public class Main {
    public static void main(String[] args) {

        Config config1 =Config.getInstance();
        System.out.println(config1.get("APP_Name"));

        Config config2 = Config.getInstance();
        System.out.println(config1 == config2);

    }

}