import java.math.BigDecimal;

public class Person {
    private final String pesel;
    private final BigDecimal salary;

    public Person(String pesel, BigDecimal salary) {
        this.pesel = pesel;
        this.salary = salary;
    }
}
