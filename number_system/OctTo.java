//OCTAL TO DECIMAL
import java.util.*;

public class OctTo{
    public static int octaltodeci(int oct){
        int deci=0;
        int pow=0;
        while(oct>0){
            int lastdigit=oct%10;
            if (lastdigit >= 8) {
                // Invalid octal digit
                System.out.println("Invalid octal digit: " + lastdigit);
                return -1;
            }
            deci=deci+(lastdigit*(int)Math.pow(8,pow));
            pow++;
            oct/=10;
        }
        return deci;
    }

    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter octal number : ");
        int oct=sc.nextInt();
        System.out.println(octaltodeci(oct)+" is decimal of octal no "+oct);
        sc.close();
    }
}