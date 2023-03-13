package creational_patterns.factory_method;

public class WhiteShip extends Ship {
    public WhiteShip(String name, String color) {
        setId("white");
        setName(name);
        setColor(color);
        setLogo("🚩🚩");
    }
}
