package creational_patterns.factory_method;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip(String name, String color) {
        System.out.println("Black Ship 제작 중!");
        return new BlackShip(name, color);
    }
}
