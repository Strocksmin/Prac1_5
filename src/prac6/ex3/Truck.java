package prac6.ex3;

public class Truck extends Car {
    private int countWheels;
    private double maxWeight;

    public void newWheels(int countWheels) {
        this.countWheels = countWheels;
        System.out.println("Количество колес - " + this.countWheels);
    }

    public Truck(int weight, String model, char color, float speed, int countWheels, double maxWeight) {
        super(weight, model, color, speed);
        this.countWheels = countWheels;
        this.maxWeight = maxWeight;
    }

}
