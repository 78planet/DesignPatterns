package creational_patterns.builder;

import creational_patterns.builder.builders.CarBuilder;
import creational_patterns.builder.builders.CarManualBuilder;
import creational_patterns.builder.cars.Car;
import creational_patterns.builder.cars.Manual;
import creational_patterns.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
