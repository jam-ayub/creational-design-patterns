package abstractfactory.material;

import abstractfactory.Button;

public class MaterialTextBox implements Button {
    @Override
    public void render() {
        System.out.println("rendering material textBox");
    }
}
