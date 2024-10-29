package abstractfactory.app;

import abstractfactory.Theme;
import abstractfactory.ant.AntButton;
import abstractfactory.ant.AntTextBox;
import abstractfactory.material.MaterialButton;
import abstractfactory.material.MaterialTextBox;

public class ContextForm {
    public void render(Theme theme) {
        if (theme == Theme.ANT) {
            new AntButton().render();
            new AntTextBox().render();
        } else if (theme == Theme.MATERIAL) {
            new MaterialButton().render();
            new MaterialTextBox().render();
        }
    };
}
