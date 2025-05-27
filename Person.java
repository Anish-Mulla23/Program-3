import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Person {
    protected String name;
    protected LocalDate dob;
public Person(String name, String dobStr) {
        this.name = name;
        this.dob = parseDate(dobStr);
    }
 private LocalDate parseDate(String dobStr) {
        DateTimeFormatter formatter;
        if (dobStr.charAt(4) == '-') {
  formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            if (dobStr.length() != 10) {
                throw new IllegalArgumentException("Invalid date format for yyyy-MM-dd: " + dobStr);
            }
        } else {
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            if (dobStr.length() != 10) {
                throw new IllegalArgumentException("Invalid date format for dd-MM-yyyy: " + dobStr);
            }
        }
        return LocalDate.parse(dobStr, formatter);
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Age: " + age);
    }
  public static void main(String[] args) {
        Person p = new Person("Anish", "2005-11-25");
        p.displayName();
        p.displayAge();
    }
}
