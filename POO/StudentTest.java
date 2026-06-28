public class StudentTest {
    public static void main(String[] args) {
        
        Student account1 = new Student("Carlos Luciano", 93.2);
        Student account2 = new Student("Silva Liberato",72.5);

        System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterAverage());
        System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterAverage());
    }
}
