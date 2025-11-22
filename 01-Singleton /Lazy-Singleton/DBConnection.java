package Singleton.Lazy;

public class DBConnection {
    private static DBConnection instance;

    private DBConnection(){
        System.out.println("Creating database connection...");
    }

    public static DBConnection getInstance(){
        if(instance==null){
            instance=new DBConnection();
        }
        return instance;
    }

    public void query(String sql){
        System.out.println("Executing " + sql);
    }
}
