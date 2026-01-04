import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int sum = 0;
        while(true){
        int n = sc.nextInt();
        if(n == 0){
            break;
        }
        sum += n;
        }
        System.out.println("Sum :"+ sum);
    }
}
