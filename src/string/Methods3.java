package string;

public class Methods3 {
    public static void main(String[] args) {

        String brand = "Nike";
        //

        boolean bl1= brand.startsWith("N");
        System.out.println(bl1);//true

        boolean bl2 = brand.startsWith("n");
        System.out.println(bl2);//false

        System.out.println(brand.startsWith("Nike"));//true
        System.out.println(brand.startsWith("nike"));//false
        System.out.println(brand.endsWith("e"));//true
        System.out.println(brand.endsWith("Nike"));//true
        System.out.println(brand.endsWith("u"));//false
        System.out.println(brand.endsWith("nike"));//false
    }
}
