import java.util.*;
class Number{
 static int max(int a, int b,int c){
    if(a >= b && a >= c){
        return a;
    }else if(b >= a && b >= c){
        return b;
    } else {
        return c;
    }
}
 static int min(int a,int b,int c){
     if(a <= b && a <= c){
        return a;
    }else if(b <= a && b <= c){
        return b;
    } else {
        return c;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers a, b,c : ");
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int Max = max(a,b,c);
        int Min = min(a,b,c);
        System.out.println("MAX" + Max);
        System.out.println("MIN" + Min);
    }
}
