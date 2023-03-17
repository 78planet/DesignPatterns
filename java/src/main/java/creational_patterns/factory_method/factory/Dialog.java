package creational_patterns.factory_method.factory;

import creational_patterns.factory_method.buttons.Button;

/*
크리에이터 클래스(인터페이스)는 제품 클래스의 객체를 반환해야하는 팩토리 메서드를 선언.
크리에이터의 자식 클래스들은 일반적으로 이 메서드의 구현을 제공한다.
 */
public interface Dialog {

    /*
    크리에이터의 주 업무는 제품을 생성하는 것이 아니다.
    크리에이터는 일반적으로 팩토리 메서드에서 반환된 제품 객체에 의존하는 어떤 핵심 비즈니스 로직을 포함한다.
    자식 클래스들은 팩토리 메서드를 구현(or 오버라이드)한 후 해당 메서드에서 다른 유형의 제품을 반환하여
    해당 비즈니스 로직을 간접적으로 변경할 수 있다.
     */
    default void renderWindow() {
        // 팩토리 메서드를 호출해서 제품 객체를 생성
        Button okButton = createButton();
        okButton.render();
    }

    Button createButton();
}
