package homework;

import java.util.Scanner;

public class AllUniqueFromArray {
    public static void main(String[] args) {
        int[] arr = new int[13];

        Scanner input = new Scanner(System.in);
        String unique = "";
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number for array");
            int number = input.nextInt();
            arr[i] = number;
        }
        //System.out.println(Arrays.toString(arr));
        for (int j=0; j< arr.length; j++){
            for (int k=0; k<arr.length; k++){
                if (j!=k && arr[j]!=arr[k] ){
                    ++count;
                    if (count==(arr.length-1)){
                        unique=unique+arr[j]+" ";
                    }
                }
            }
            count=0;
        }
        if (unique.equals("")){
            System.out.println("Array doesn't have any unique element");
        }
        System.out.println(unique);

    }
}
