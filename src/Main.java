import factory.ProductsController;
import singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        new ProductsController().listProducts();
    }
}