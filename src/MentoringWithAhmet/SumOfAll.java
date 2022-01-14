package MentoringWithAhmet;

public class SumOfAll {
    public static void main(String[] args) {
        //i am going to use main method to run my codes.
        int []array = {1,2,3,4,5,6,7,8,9,22,65,76};
        SumOfAll(array);
    }
    public static void SumOfAll(int[] array){
        //how can i find the even numbers inside of the array

        // GIVE A MAN A FISH YOU FEED HIM FOR A DAY. TEACH A MAN TO FISH YOU FEED HIM FOR LIFE TIME.
        int sumOfEvenNumber=0;
        int sumOfOddNumber=0;
        int differences=0;
        for(int number:array){
            if(number%2==0){
                sumOfEvenNumber+=number;
            }else if(number%2!=0){
                sumOfOddNumber+=number;

            }

        }
        System.out.println(sumOfEvenNumber);
        System.out.println(sumOfOddNumber);
        System.out.println(sumOfEvenNumber-sumOfOddNumber);


    }
}
