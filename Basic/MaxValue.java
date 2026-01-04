import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n :");
        boolean isInput = false;
        int max = Integer.MIN_VALUE;
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            max = Math.max(max,n);
            isInput = true;
        }
        if(isInput){
        System.out.println("Max Value : "+max);
    } else {
        System.out.println("No max Value");
    }
}
}
