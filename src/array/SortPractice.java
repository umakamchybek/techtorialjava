package array;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[]args){

        int[]zipCodes = {61212,91213,11214,71215};
        System.out.println(Arrays.toString(zipCodes));//[61212, 91213, 11214, 71215]

        Arrays.sort(zipCodes);//sorting from smaller to larger
        System.out.println(Arrays.toString(zipCodes));//[11214, 61212, 71215, 91213]

        String[]colors={"violet","pink","Red","white","black", "red","brown"};

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));






    }
}
