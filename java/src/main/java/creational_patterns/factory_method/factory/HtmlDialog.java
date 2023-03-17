package creational_patterns.factory_method.factory;

import creational_patterns.factory_method.buttons.Button;
import creational_patterns.factory_method.buttons.HtmlButton;

public class HtmlDialog implements Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
