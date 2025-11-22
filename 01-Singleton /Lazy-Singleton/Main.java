import Singleton.Lazy.DBConnection;

public class Main {
    public static void main(String[] args) {
        DBConnection db1=DBConnection.getInstance();

        db1.query("SELECT * FROM products;");
        DBConnection db2=DBConnection.getInstance();

        System.out.println(db1 == db2);

    }

}