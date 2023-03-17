package creational_patterns.factory_method.buttons;

// 구상 제품들은 제품 인터페이스의 다양한 구현을 제공.
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Html Button render..");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("<button>ok!</button>");
    }
}
