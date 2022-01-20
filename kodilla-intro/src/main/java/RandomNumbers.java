import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random random = new Random();
        int result = 0;
        int sum = 0;
        int max = 5000;
        while (sum <= max) {
            int temp = random.nextInt(31);
            sum = sum + temp;


        }
    }
}





