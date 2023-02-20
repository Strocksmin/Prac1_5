package prac6.ex2;

public class Client implements Human {

    private String bankName;
    private String name, lastname;

    public Client(String name, String lastname, String bankName) {
        this.bankName = bankName;
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void getAllInfo() {
        System.out.println("Название банка: " + bankName);
        System.out.println("Клиент: " + this.getName() + ' ' + this.getLastname());
    }
}
