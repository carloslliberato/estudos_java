
import java.time.LocalDate;

public class Employee {
    private static int count = 0;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private LocalDate hireDate;

    public Employee(String firstName,
                    String lastName,
                    LocalDate birthDate,
                    LocalDate hireDate
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        ++count;
    }

    public String toString(){
        return String.format("%s, %s Hired: %s BirthDay: %s",
            lastName, firstName, hireDate, birthDate
        );
    }

    public static int getCount(){
        return count;
    }
}
