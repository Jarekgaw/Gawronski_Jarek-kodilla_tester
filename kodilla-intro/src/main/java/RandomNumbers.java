import java.util.Random;

public class RandomNumbers {
    private int min;
    private int maksimum;

    public RandomNumbers () {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        int max = 5000;
        int getMin = 31;
        int getMax = 0;
        while (sum <= max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            //System.out.println(temp);
            if (temp < getMin) {
                getMin = temp;
            }
            if (temp > getMax) {
                getMax = temp;
            }

        }
    }
        public int getMin(){
            int getMin = 0;
            return getMin;
        }
        public int getMax(){
        int getMax = 0;
        return getMax;
    }

}





