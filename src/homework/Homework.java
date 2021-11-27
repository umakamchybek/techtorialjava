package homework;

public class Homework {
    public static void main(String[] args) {

        int a = 5;
        int b = 9;
        int result = a++ + ++a + --b + ++b + b + ++a + ++b - --b + a;
        System.out.println(result);
    }
}
