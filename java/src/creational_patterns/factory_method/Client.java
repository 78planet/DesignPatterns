package creational_patterns.factory_method;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "nice white ship", "white");
        client.print(new BlackShipFactory(), "nice black ship", "black");

        // Ship whiteShip = new WhiteShipFactory().shipOrder("nice white ship", "white");
        // System.out.println(whiteShip.toString());
        //
        // Ship blackShip = new BlackShipFactory().shipOrder("nice black ship", "black");
        // System.out.println(blackShip.toString());

    }

    private void print(ShipFactory shipFactory, String name, String color) {
        Ship ship = shipFactory.shipOrder(name, color);
        System.out.println(ship.toString());
    }
}
