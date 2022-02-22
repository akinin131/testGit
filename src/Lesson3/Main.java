package Lesson3;

import static java.awt.SystemColor.info;

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car();
        Car AUDI = new Car();
        Car FORD = new Car();
        BMW.age = 10;
        BMW.color = "red";
        BMW.model = "BMW";

        AUDI.model = "AUDI";
        AUDI.color = "blue";
        AUDI.age = 12;

        FORD.model = "FORD";
        FORD.age = 9;
        FORD.color = "red";

        Car[] cars = new Car[3];
        cars[0] = BMW;
        cars[1] = AUDI;
        cars[2] = FORD;

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].model.equals("BMW")) {
                cars[i].info();
            }

        }

    }
}
