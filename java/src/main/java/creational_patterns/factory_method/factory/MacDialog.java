package creational_patterns.factory_method.factory;

import creational_patterns.factory_method.buttons.Button;
import creational_patterns.factory_method.buttons.MacButton;

/*
구상 크리에이터(concrete creator)들은 결과 제품들의 유형을 변경하기 위해 팩토리 메서드를 구현합니다.
 */
public class MacDialog implements Dialog {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
