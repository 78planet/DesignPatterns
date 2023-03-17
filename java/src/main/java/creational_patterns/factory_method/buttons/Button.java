package creational_patterns.factory_method.buttons;

// 제품 인터페이스는 모든 구상 제품(Concrete Product)들이 구현해야하는 작업들을 선언
public interface Button {
    void render();
    void onClick();
}
