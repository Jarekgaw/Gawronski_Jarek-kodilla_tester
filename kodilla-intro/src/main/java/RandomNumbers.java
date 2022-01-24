import java.util.Random;

public class RandomNumbers {
    private int min;
    private int maksimum;

    public RandomNumbers () {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int max = 5000;
        min = 31;
        maksimum = 0;
        while (sum <= max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            //System.out.println(temp);
            if (temp < min) {
                min = temp;
            }
            if (temp > maksimum) {
                maksimum = temp;
            }

        }
    }
        public int wynikMin(){
            return min;
        }
        public int maksimum(){
        return maksimum;
    }

}





