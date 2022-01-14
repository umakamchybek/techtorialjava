package blocks;

public class Practice {


    {
        System.out.println("This is an Instance block");

    }

    static {
        System.out.println("This is Static block");
    }

    public static void main(String[] args) {

        Practice o = new Practice();
        Practice o1 = new Practice();


    }
}
