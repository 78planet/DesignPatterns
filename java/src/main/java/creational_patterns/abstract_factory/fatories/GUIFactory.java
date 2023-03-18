package creational_patterns.abstract_factory.fatories;

import creational_patterns.abstract_factory.buttons.Button;
import creational_patterns.abstract_factory.checkboxes.CheckBox;

/*
추상 팩토리 인터페이스는 다른 추상 제품들을 반환하는 메서들의 집합을 선언한다.
이러한 제품들을 패밀리라고 하며 일반적으로 서로 협력할 수 있다.
제품들의 패밀리에는 여러 변형이 있을 수 있지만 다른 변형들의 제품들과 호환되지 않는다.
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
