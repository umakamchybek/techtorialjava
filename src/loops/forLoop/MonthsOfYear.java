package loops.forLoop;

public class MonthsOfYear {
    public static void main(String[] args) {

        /*
        print out months for the years between 2020 to 2023
        2020--->1,2,3....12
        print out names of each month
         */
        for(int year = 2020; year<=2023; year++){
            System.out.print(year+"--->");
            for(int month=1; month<=12; month++){
                System.out.print(month+" ");

                switch (month){

                    case 1:
                        System.out.print(" Jan ");
//                        for(int m=1;  m<=31; m++){
//                            System.out.println(m+ " ");
//                        }
                        break;
                    case 2:
                        System.out.print(" Feb ");
                        break;
                        case 3:
                        System.out.print(" Mar ");
                        break;
                        case 4:
                        System.out.print(" Apr ");
                        break;
                        case 5:
                        System.out.print(" May ");
                        break;
                        case 6:
                        System.out.print(" Jun ");
                        break;
                        case 7:
                        System.out.print(" Jul ");
                        break;
                        case 8:
                        System.out.print(" Aug ");
                        break;
                        case 9:
                        System.out.print(" Sep ");
                        break;
                        case 10:
                        System.out.print(" Oct ");
                        break;
                        case 11:
                        System.out.print(" Nov ");
                        break;
                        case 12:
                        System.out.print(" Dec ");
                        break;

                }

            }
            System.out.println();


        }

    }
}
