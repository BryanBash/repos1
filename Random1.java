import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        int min = 1;
        int max = 30;

        System.out.println(randNum(min, max));
    }

    public static int randNum(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}