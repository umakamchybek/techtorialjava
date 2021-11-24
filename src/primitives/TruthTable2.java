package primitives;

public class TruthTable2 {
    public static void main(String[] args) {

     //task
     // there is an event for kids
     // if the age of a child 6 or less or if the height of the child is 48" or less, the event is free for a child

     int reqAge = 6;
     int reqHeight = 48;
     int kidAge = 7;
     int kidHeight=47;

     boolean free = kidAge<=reqAge || kidHeight<= reqHeight;

        System.out.println("Is my kid is eligible?" + free);

        //task
        // find out if student can pass the class
        // there 3 tests taken
        //average of those tests has to be more than 70
        //attendance rate of the student has to be 80% or more

        int averageTest = 70;
        int reqAttendance = 80;

        int test1 = 65;
        int test2 = 79;
        int test3 = 85;
        int studentAttendance = 81;

        boolean canPass =  (test1+test2+test3)/3>= averageTest && studentAttendance >= reqAttendance;
        System.out.println("Can student pass?" + canPass); //true


    }
}
