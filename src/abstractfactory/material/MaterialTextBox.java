package abstractfactory.material;

import abstractfactory.Button;
import abstractfactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("rendering material textBox");
    }
}
