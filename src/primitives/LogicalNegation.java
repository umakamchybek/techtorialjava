package primitives;

public class LogicalNegation {
    public static void main(String[] args){

        boolean isLightOn = true;
        System.out.println(isLightOn);

        System.out.println(!isLightOn);
        System.out.println(5==5);// true
        System.out.println(!(5==5));//false

        boolean haveMoney = false;

        haveMoney= !haveMoney;
        System.out.println(haveMoney);//true

        System.out.println(">>>>>" + isLightOn);//true
        System.out.println("havemoney>>>>" + haveMoney);//true
        System.out.println(isLightOn==haveMoney);//true
        System.out.println(!(isLightOn==haveMoney));//false




    }
}
