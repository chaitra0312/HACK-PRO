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
      if(n==reversed){
          System.out.println("True");
      }
      else {
          System.out.println("False");
      }
   }
}


// String
import java.util.*;
public class Demo {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       String n = sc.nextLine();
       String str = String.valueOf(n);
       String rev = new StringBuilder(str).reverse().toString();
      if(str.equals(rev)){
          System.out.println("True");
      }
      else {
          System.out.println("False");
      }
   }
}

//comparing first and last:
import java.util.*;
public class Demo {
    static boolean isPalindrome(int n){
        int div = 1;
        while(n/div >= 10){
            div *=10;
        }
        while(n!=0){
            int first = n/div;
            int last = n%10;
            if(first != last) return false;
            n = (n%div)/10;
            div/=100;
        }
        return true;
    }
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int n = sc.nextInt();
       System.out.println(isPalindrome(n));
   }
}
//interview
import java.util.*;
public class Demo {
    static boolean isPalindrome(int n){
        if(n < 0 || (n%10 ==0&& n!=0)) return false;
        int reversedHalf =0;
        while( n > reversedHalf){
            reversedHalf = reversedHalf*10+n%10;
            n /= 10;
        }
        return (n==reversedHalf || n == reversedHalf /10);
    }
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int n = sc.nextInt();
       System.out.println(isPalindrome(n));
   }
}
