package array;

public class SmallestNum {
    public static void main(String[] args) {

        int[] nums = {4, 24, 10, 100, 5, 78, 11, 25, 55};
        //find the smallest number
        int smallest=nums[0];
        int biggest=nums[0];

        for (int i = 1; i < nums.length; i++) {

            if(nums[i]< smallest) {
                smallest=nums[i];
            }
        }
        System.out.println(smallest);
        //find the biggest number

        for (int i = 1; i < nums.length; i++) {

            if(nums[i]> biggest) {
                biggest=nums[i];
            }
        }
        System.out.println(biggest);

    }
}
