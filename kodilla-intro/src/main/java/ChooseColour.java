import java.util.Scanner;

public class ChooseColour {

    public static String chooseColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select letter (B-blue, R-red, P-pink):");
            String colour = "";
            String B = "Blue";
            String R = "Red";
            String P = "Pink";
            switch (colour) {
                case "B":
                    return "Blue";
                case "R":
                    return "Red";
                case "P":
                    return "Pink";
                default:
                    System.out.println("Wrong letter");
            }
        }
    }
}


