package wrapper;

public class StringToPrimitive {
    public static void main(String[] args) {

        String str="12";
        System.out.println(str+10);//1210
        int num=Integer.parseInt(str);//UnBoxing
        System.out.println(num+10);//22
        Integer number1=Integer.parseInt(str);
        System.out.println(number1.equals("12"));//false
        System.out.println(num==12);//true


        //127

        byte by= Byte.parseByte("127");
        System.out.println(by);

       // int number2 = Integer.parseInt("128GB");// NumberFormatException

       boolean bl= Boolean.parseBoolean("true");
        System.out.println(bl);
        boolean bl2= Boolean.parseBoolean("True");
        System.out.println(bl2);
        boolean bl3= Boolean.parseBoolean("TRUE");
        System.out.println(bl3);
        boolean bl4= Boolean.parseBoolean("example");
        System.out.println(bl4);
        boolean bl5= Boolean.parseBoolean(" true");
        System.out.println(bl5);

        float fl= Float.parseFloat("1.2");
        System.out.println(fl);
        float fl1= Float.parseFloat("12.3f");
        System.out.println(fl1);


        long lg=Long.parseLong("12333");
        System.out.println(lg);

        double db=Double.parseDouble("2.5d");
        System.out.println(db);





    }
}
