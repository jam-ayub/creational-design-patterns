package abstractfactory.app;

import abstractfactory.WidgetFactory;

public class ContextForm {
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.createTextBox().render();
    };
}
