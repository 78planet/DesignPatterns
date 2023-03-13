package creational_patterns.factory_method;

public interface ShipFactory {

    default Ship shipOrder(String name, String color) {
        validate(name, color);
        Ship ship = createShip(name, color);
        sendEmail(ship);

        return ship;
    }

    Ship createShip(String name, String color);

    private void sendEmail(Ship ship) {
        System.out.println(ship.getId() + " 제작 완료 이메일 발송!");
    }

    private void validate(String name, String color) {
        if (name.isEmpty()) {
            System.out.println("이름을 입력해 주세요");
            throw new IllegalArgumentException();
        }
        if (color.isEmpty()) {
            System.out.println("색상을 입력해 주세요");
            throw new IllegalArgumentException();
        }
    }
}
