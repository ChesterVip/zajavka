import java.math.BigDecimal;

public class Person {

    private final String name;
    private final String surname;
    private final Long Age;
    private final String pesel;
    private final BigDecimal salary;


    public Person(String name, String surname, Long age, String pesel, BigDecimal salary) {
        this.name = name;
        this.surname = surname;
        this.Age = age;
        this.pesel = pesel;
        this.salary = salary;
    }

    void method(String pesel, BigDecimal salary) {
        System.out.printf("twój Pesel to: %s a twoje wynagrodzenie to %s", pesel, salary);

    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getPesel() {
        return pesel;
    }

    public Long getAge() {
        return Age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}
