package prac6.ex1;

public abstract class Human {
    private String name;
    private String lastname;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void getAllInfo() {  // Вывод имени и фамилии
        System.out.println(getName() + ' ' + getLastname());
    }

    public Human(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
}
