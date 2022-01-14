package objects;

public class Netflix {

    /*
    create NetFlix-Class:
    `create following instance fields in the NetFlix-Class
        -accountName, userName, monthlyData
    `create a method that will update monthlyData for every usage
    `make sure this method takes parameter for data usage, and userName
    `run your code in a Test-Class
     */

    String accountName;
    String userName;
    static int monthlyData=100;

    public static void usage(int usedData){
        monthlyData-=usedData;
        System.out.println();
        System.out.println(" You have left "+monthlyData+ " GB monthly data");

    }
}
