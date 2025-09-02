// Brute force approach
import java.util.*;
class Memo {
    public static int FindGcd(int a , int b){
        int gcd=1;
        for(int i=1;i<=Math.min(a,b)-1;i++){
            if(a%i==0 && b%i==0){
                gcd =i;
            }
        }
        return gcd;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = FindGcd(a,b);
        System.out.println("The GCD od A & B is: "+gcd);
    }
}

//Better solution 
import java.util.*;
class Memo {
    public static int FindGcd(int a , int b){
        for(int i=Math.min(a,b);i >=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = FindGcd(a,b);
        System.out.println("The GCD od A & B is: "+gcd);
    }
}

//optimize solution
import java.util.*;
class Memo {
    public static int FindGcd(int a , int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else {
                b=b%a;
            }
        }
            if(a==0){
                return b;
            }
                return a;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a & b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = FindGcd(a,b);
        System.out.println("The GCD od A & B is: "+gcd);
    }
}
