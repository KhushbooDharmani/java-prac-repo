// decimal to binary

import java.util.*;

public class DeciToBin{

    public static int decimaltobinary(int deci){
        int pow = 0;
        int binary=0;
        while(deci>0){
            int rem = deci%2;
            binary=binary+(rem*(int)Math.pow(10,pow));
            pow++;
            deci=deci/2;
        }
        return binary;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter decimal number : ");
        int deci=sc.nextInt();

        System.out.println(decimaltobinary(deci));
    }
}