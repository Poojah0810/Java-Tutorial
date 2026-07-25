package OOPS_Day_1;

class Car {
    private String model;
    private int year;

    // No Argument Constructor
    public Car() {
        this.model = "THAR";
        this.year = 2026;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class No_Arguement_Constructor {
    public static void main(String[] args) {

        Car car = new Car();
        car.display();

    }
}