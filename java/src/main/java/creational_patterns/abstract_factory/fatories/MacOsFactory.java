package creational_patterns.abstract_factory.fatories;

import creational_patterns.abstract_factory.buttons.Button;
import creational_patterns.abstract_factory.buttons.MacButton;
import creational_patterns.abstract_factory.checkboxes.CheckBox;
import creational_patterns.abstract_factory.checkboxes.MacCheckBox;

/*
구상 팩토리들은 단일 변형에 속하는 제품들의 패밀리 생성한다.
이 팩토리는 결과 제품들의 호환을 보장한다.
 */
public class MacOsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
