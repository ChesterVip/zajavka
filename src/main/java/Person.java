import java.math.BigDecimal;

public class Person {
    private final String pesel;
    private final BigDecimal salary;

    public Person(String pesel, BigDecimal salary) {
        this.pesel = pesel;
        this.salary = salary;
    }
    void method(String pesel, BigDecimal salary){
        System.out.printf("twój Pesel to: %s a twoje wynagrodzenie to %s", pesel, salary);
    }
}
