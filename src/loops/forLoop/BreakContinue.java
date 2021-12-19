package loops.forLoop;

public class BreakContinue {
    public static void main(String[] args) {

        for(int i=0; i <20; i++){
            System.out.println("========");
          if(i<7)
              continue;

            for (int k =0; k< 10;k++){

                System.out.println("i--->"+i);
                System.out.println("k--->"+k);

            }
        }


    }
}
