import singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        ConfigManager configManager = ConfigManager.getInstance();
        configManager.set("name", "jam");

        ConfigManager otherManager = ConfigManager.getInstance();
        System.out.println(otherManager.get("name"));;
    }
}