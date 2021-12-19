package loops.while_DoWhile;

public class WhileTask2 {
    public static void main(String[] args) {
        /*
         -you $40 in your international phone calling account
  -if every call you make costs $5
  -find out and print: how many total calls you can make with your balance of $40
    ex. print out --> "you can make <...> calls with your balance"
        */
        int balance = 40;
        int call$=5;
        int count =0;
        while (balance>0) {
            balance -= call$;
            count++;
            int calls = balance/call$;

            System.out.println("You can make " + calls +" calls with your balance " + balance);

        }
            System.out.println("You can make " + count +" calls with your balance ");

        }
    }

