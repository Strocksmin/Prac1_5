package prac6;

public class Client extends Human {

    private String bankName;


    @Override
    public void getAllInfo() {
        System.out.println("Название банка: " + bankName);
        System.out.println("Клиент: " + this.getName() + ' ' + this.getLastname());
    }

    public Client(String name, String lastname, String bankName) {
        super(name, lastname);
        this.bankName = bankName;
    }
}
