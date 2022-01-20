package stringBuilder;

public class Practice1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("techtorial");

        //charAt();

       Character ch= builder.charAt(2);
        System.out.println(ch);

        // length();
       Byte b =(byte)(builder.length());
        System.out.println(b);


        // indexOf();

        System.out.println(builder.indexOf("t"));//0
        System.out.println(builder.indexOf("t",3));//

        // subString();

        System.out.println(builder.substring(5));
        String sub = builder.substring(5);
        System.out.println(sub);
       // StringBuilder sub1 = builder.substring(5);

        StringBuilder sub2=new StringBuilder(builder.substring(5));
        StringBuilder sub3=new StringBuilder(sub);

        System.out.println(builder.substring(2,5));

        // insert()
        builder.insert(4,"TECH");
        System.out.println(builder);
        builder.insert(builder.length(), " ACADEMY");
        System.out.println(builder);
        // delete();
        builder.delete(0,4);
        System.out.println(builder);
        //deleteCharAt()
        builder.deleteCharAt(builder.indexOf(" "));
        System.out.println(builder);

        // reverse this builder
        StringBuilder builder1=new StringBuilder();
        for( int i = builder.length()-1;i> -1; i--){
            builder1.append(builder.charAt(i));
        }
        System.out.println(builder1);

        //reverse()
        builder.reverse();
        System.out.println(builder);
        System.out.println(builder.reverse());





    }
}
