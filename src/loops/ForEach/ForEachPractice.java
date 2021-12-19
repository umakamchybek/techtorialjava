package loops.ForEach;

public class ForEachPractice {
    public static void main(String[] args) {
        int[] number={45,23,5,7,21,66,100};

        //print out each element from this array by using for each loop

        for(int i=0; i <= number.length-1; i++){
            System.out.println(number[i]);

        }
        System.out.println("====================");
        for(int num:number){
            System.out.println(num);
        }
        System.out.println("====================");

        String[] flowers={"rose","lily","orchid","violet","tulip"};
        for (String flower: flowers){
            System.out.println(flower);
            System.out.println(flowers[0]);// will print first element length of array
        }

    }
}

