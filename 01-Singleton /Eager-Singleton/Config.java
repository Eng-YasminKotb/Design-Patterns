package Singleton.Eager;

public class Config {
    private static final Config instance=new Config();

    private Config(){
        System.out.println("⚙️ Loading application configuration...");
    }

    public static Config getInstance(){
        return instance;
    }

    public String get(String key){
        return switch (key) {
            case "App_NAME" -> "NoteApp";
            case "VERSION"  -> "1.0.0" ;
            default -> "Not Found";
                    };
    }

}
