import java.util.Scanner;

public class ChooseColour {

    public static String chooseColour(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select letter (B-blue, R-red, P-pink):");
            String colour;
            String B = "Blue";
            String R = "Red";
            String P = "Black";
        switch (colour) {
            case "B": return "Blue";
                break;
            case "R": return "Red";
                break;
            case "P": return "Pink";
            default:
                System.out.println("Wrong letter");
        }
    }

}
