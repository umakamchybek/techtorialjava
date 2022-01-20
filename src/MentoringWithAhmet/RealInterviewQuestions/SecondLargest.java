package MentoringWithAhmet.RealInterviewQuestions;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        //find the largest and the second largest with the sort method
        int[] array= {100,300,200,450,350,23455,1342434,334,234234234};
       // Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(array[array.length-1]);
//        System.out.println(array[array.length-2]);

         int largest=array[0];
         int secondLargest=0;
        for(int i =0 ;i<array.length;i++){
            if(array[i]>largest ){
                secondLargest=largest;
                largest=array[i];

            }else if(array[i]>secondLargest &&array[i]!=largest){
                secondLargest=array[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);


    }
}
