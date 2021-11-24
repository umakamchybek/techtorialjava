package primitives;

public class TruthTable1 {
    public static void main(String[] args) {

        //task
        //  visa and ticket

        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;

        boolean cantravel = visa == myVisa && myTicket==ticket;

        System.out.println(cantravel); // false

         // task
        // ask question

        boolean online = false;
        boolean campus = true;

        boolean student = true;

        boolean askQuestion =student == online||student==campus;
        System.out.println("can i ask a question?" + askQuestion);//true

         // task
        //90% and more attendance and score of 80 or more to pass this class

        int requiredAttendance = 90;
        int requiredScore = 80;
        int yourAttendance = 100;
        int yourScore = 90;

        boolean pass = yourAttendance>=requiredAttendance && yourScore >=requiredScore;

        System.out.println("can I pass the course?" + pass); //true








    }
}
