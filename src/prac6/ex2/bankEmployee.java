package prac6.ex2;

public class bankEmployee implements Human {

    private String bankName;
    private String name, lastname;

    public bankEmployee(String name, String lastname, String bankName ) {
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
        System.out.println("Сотрудник: " + this.getName() + ' ' + this.getLastname());
    }
}
