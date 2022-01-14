package objects;

public class NetflixTest {
    public static void main(String[] args) {
        Netflix flix = new Netflix();

        flix.usage(20);

        Netflix.usage(5);
        Netflix net = new Netflix();
        net.usage(35);

    }
}
