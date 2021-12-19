package array;

import java.util.Arrays;

public class CharPractice {
    public static void main(String[] args) {
        char[]chs={'A','4','&','z', '3','u','*',55};
        char[] others=new char[chs.length];
        int count=0;

        for(int a=0; a< chs.length; a++){


            if(chs[a]>='0' && chs[a]<='9'){

                System.out.println(chs[a]);
                count++;
            }
            else{
                others[a]=chs[a];
            }

        }
        System.out.println(Arrays.toString(others));
        Arrays.sort(others);
        System.out.println(Arrays.toString(others));
    }
}
