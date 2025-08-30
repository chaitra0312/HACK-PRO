import java.util.*;
public class Demo {
   public static int countNumber(int n){
       int count = 0;
       while(n > 0){
           count++;
           n=n/10;
       }
       return count;
   }
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int N = sc.nextInt();
       int Digits = countNumber(N);
       System.out.println("No of Digits: "+Digits);
   }
}
// using functions and time complexity log10(n) the no of times the loop is running the time is counting and it's worst case scenario.


//using logerthemic:
import java.util.*;
public class Demo {
   public static int countNumber(int n){
       int count = (int) (Math.log10(n)+1);
       return count;
   }
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int N = sc.nextInt();
       int Digits = countNumber(N);
       System.out.println("No of Digits: "+Digits);
   }
}

//time complexity o(1).
