package prac6.ex1;

public class Main {
    public static void main(String[] args)
    {
        Client newclient = new Client("Юлий", "Цезарь", "УралСИБ");
        newclient.getAllInfo();

        bankEmployee bankEmployee = new bankEmployee("Алексей", "Иванович", "УралСИБ");
        bankEmployee.getAllInfo();
    }
}
