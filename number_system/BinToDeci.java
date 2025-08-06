//conversion number system from binary to decimal
import java.util.*;

public class BinToDeci{
    public static int binaryconversion(int binary){
        int pow=0;
        int decnum=0;

        while(binary>0){
            int lastdigit = binary%10;
            decnum = decnum + (lastdigit*(int)Math.pow(2,pow));
            pow++;
            binary=binary/10;
        }
        return decnum;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a binary number : ");
        int binary = sc.nextInt();
        System.out.println(binaryconversion(binary) +" is  decimal  of "+ binary );
    }
}