package prac6.ex1;

public class bankEmployee extends Human {

    private String bankName;

    public bankEmployee(String name, String lastname, String bankName) {
        super(name, lastname); // super - обращение к родительскому классу
        this.bankName = bankName;
    }

    @Override
    public void getAllInfo() {
        System.out.println("Название банка: " + bankName);
        System.out.println("Сотрудник: " + this.getName() + ' ' + this.getLastname());
    }
}
