class Car {
    String make, model;
    int year;

    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.make = "Toyota";
        car.model = "Camry";
        car.year = 2022;
        car.displayDetails();
    }
}
