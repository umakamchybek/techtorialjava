package homework;
import java.util.Arrays;
public class Duplicates2 {

        public static void main(String[] args) {
            int num1[] = {1, 2, 9,5,3,5,5,5};
            int num2[] = {5, 3, 8,3,3,3,5,5};

            System.out.println(Arrays.toString(dublicates(num1, num2)));
        }

        public static int[] dublicates(int[] num1, int[] num2) {

            String dublicateds="";

            boolean isdublicated = false;//flag means you will go with all the elements one by one and return only the ones that you want
            for (int i = 0; i < num1.length; i++) {
                isdublicated = false;
                for (int k = 0; k < num2.length; k++) {
                    if (num1[i] == num2[k]) {

                        dublicateds+=num1[i];//29
                        isdublicated = true;
                    }
                }
            }
            int[] array = new int[dublicateds.length()];
            for(int j = 0; j<dublicateds.length();j++){
                array[j]=Integer.parseInt(dublicateds.substring(j,j+1));
        }
            if (isdublicated) {

                return array;// remove duplicates before returning array
            } else {
                return null;
            }

        }



}
