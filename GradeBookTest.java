public class GradeBookTest {
    public static void main(String[] args) {
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        GradeBook myGradeBook = new GradeBook("CIJ - Introducao a JAVA", gradesArray);

        System.out.printf("Bem-vindo(a) ao Grade Book para %s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
