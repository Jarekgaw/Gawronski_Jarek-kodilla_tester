import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String myName = "Jarek";
        int myAge = 22;
        double height = 1.78;
        char carClass = 'A';
        boolean isGoodProgrammer = true;
        System.out.println(myName);

        Book book = Book.of("Isaac Asimov", "The Galaxy");
        RandomNumbers randomNumbers = new RandomNumbers();
        System.out.println(randomNumbers.wynikMin());
        System.out.println(randomNumbers.maksimum());

    }
}
