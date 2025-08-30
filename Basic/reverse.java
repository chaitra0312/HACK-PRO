import java.util.*;
public class Demo {
   public static int  revNumber(int n){
       int revNum = 0;
        while(n >0){
            int last = n%10;
                revNum =  (revNum*10)+last;
                n = n/10;
        }
        return revNum;
   }
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int n = sc.nextInt();
       int reversed = revNumber(n);
       System.out.println("reversed Number"+reversed);
   }
}
//time complexity Olog10(n)+1.
