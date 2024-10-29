import abstractfactory.ant.AntWidgetFactory;
import abstractfactory.app.ContextForm;
import abstractfactory.material.MaterialWidgetFactory;
import factory.ProductsController;
import singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        new ContextForm().render(new MaterialWidgetFactory());
        new ContextForm().render(new AntWidgetFactory());
    }
}