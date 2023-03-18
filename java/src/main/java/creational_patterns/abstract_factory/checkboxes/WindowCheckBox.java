package creational_patterns.abstract_factory.checkboxes;

public class WindowCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Window Checkbox");
    }
}
