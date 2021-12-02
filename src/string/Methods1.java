package string;

public class Methods1 {
    public static void main(String[] args) {
        String device= "microphone";
        device.concat(" is an input device");

        System.out.println(device);//microphone

        char ch = device.charAt(1);
        System.out.println(ch);//i

        int letterCount = device.length();//returns a number---->10
        System.out.println(letterCount);
        device+= " is expensive";
        device = device.concat(" device");

        System.out.println(device.length());// microphone is expensive device

        // take last char from this last version of the string
        System.out.println(device.charAt(29));//

        String example = "Among all the wonderful things in this world, We are grateful to be a part of such a wonderful, supportive, and loving family!\n" +
                "May you enjoy the feast and the company of your family on Thanksgiving day.";
        char lastChar = example.charAt(example.length()-1);
        System.out.println(lastChar);
        // task

         String school = "Techtorial";
         //find the middle char from last string

        System.out.println(school.charAt((school.length()-1)/2));
        System.out.println(school.charAt(school.length()/2));

        System.out.println(school.charAt(15));//StringIndexOutOfBoundsException, since there is no 15th index



    }
}
