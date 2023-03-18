package creational_patterns.abstract_factory.fatories;

import creational_patterns.abstract_factory.buttons.Button;
import creational_patterns.abstract_factory.buttons.WindowButton;
import creational_patterns.abstract_factory.checkboxes.CheckBox;
import creational_patterns.abstract_factory.checkboxes.WindowCheckBox;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowCheckBox();
    }
}
