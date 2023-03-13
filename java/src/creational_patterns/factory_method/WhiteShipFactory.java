package creational_patterns.factory_method;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip(String name, String color) {
        System.out.println("White Ship 제작 중!");
        return new WhiteShip(name, color);
    }
}
