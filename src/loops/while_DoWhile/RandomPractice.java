package loops.while_DoWhile;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println(num);
        int num2 = random.nextInt(2);
        System.out.println(num2);
    }
}
