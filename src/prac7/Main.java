package prac7;

public class Main {
    public static void main(String[] args)
    {
        Airplane airplane = new Airplane();
        Airplane.Wing wing1 = airplane.new Wing(110);
        Airplane.Wing wing2 = airplane.new Wing(100);

        System.out.println("Крыло 1. Вес - " + wing1.getWeight());
        System.out.println("Крыло 2. Вес - " + wing2.getWeight());
    }
}
