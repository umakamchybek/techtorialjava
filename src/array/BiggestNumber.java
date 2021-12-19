package array;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] nums = {4, 24, 10, 100, 5, 78, 11, 25, 55};
        //find the biggest number
        int biggestNumber=nums[0];

        for (int i = 1; i < nums.length; i++) {

            if(nums[i]>biggestNumber) {
                biggestNumber=nums[i];
            }
        }
        System.out.println(biggestNumber);

        System.out.println("===============");
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length-1]);//largest
        System.out.println(nums[0]);//smallest number in the array
    }
}
