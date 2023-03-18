package creational_patterns.abstract_factory.app;

import creational_patterns.abstract_factory.buttons.Button;
import creational_patterns.abstract_factory.checkboxes.CheckBox;
import creational_patterns.abstract_factory.fatories.GUIFactory;

/*
클라이언트 코드는 GUIFactory, Button, Checkbox와 같은 추상 유형을 통해서만
팩토리들 및 제품들과 작동하며, 이는 클라이언트 코드를 손상하지 않고
클라이언트 코드에 모든 팩토리 또는 하위 클래스를 전달할 수 있게 해준다.
 */
public class Application {
    private CheckBox checkBox;
    private Button button;

    public Application(GUIFactory guiFactory) {
        this.checkBox = guiFactory.createCheckbox();
        this.button = guiFactory.createButton();
    }

    public void paint() {
        checkBox.paint();
        button.paint();
    }
}
