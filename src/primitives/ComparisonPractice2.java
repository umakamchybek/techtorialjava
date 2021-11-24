package primitives;

public class ComparisonPractice2 {
    public static void main(String[] args) {
         // there is an event for kids if a child's height is 48" or more they can attend this event
        // print out the result if kid can attend or not

        int childHeight = 54;
        int reqHeight = 48;

        boolean canAttend = childHeight>= reqHeight;

        System.out.println("Can kid attend the event?" + canAttend);// true

           // task
        // if the age of a kid is 6 or less it will free

        int reqAge = 6;
        int kidAge = 7;

        boolean isFree = kidAge<=reqAge;

        System.out.println("is the event fir child?" + isFree);



    }
}
