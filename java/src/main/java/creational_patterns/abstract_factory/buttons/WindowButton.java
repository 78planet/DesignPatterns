package creational_patterns.abstract_factory.buttons;

public class WindowButton implements Button {
    @Override
    public void paint() {
        System.out.println("Window Button");
    }
}
