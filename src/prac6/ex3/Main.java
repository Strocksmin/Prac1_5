package prac6.ex3;

public class Main {
    public static void main(String[] args)
    {
        Truck truck = new Truck(3900, "HOWO T5G", 'G', 90, 6, 2500);
        truck.outPut();
        truck.newWheels(8);
        Car car = new Car(1200, "Жигули", 'Y', 130);
        car.outPut();
    }
}