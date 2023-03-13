package creational_patterns.factory_method;

public class BlackShip extends Ship {
    public BlackShip(String name, String color) {
        setId("black");
        setName(name);
        setColor(color);
        setLogo("🔔🔔");
    }
}
