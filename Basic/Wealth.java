
import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array : ");
    int m = sc.nextInt();
    int n = sc.nextInt();
       int[][] arr = new int[n][m];
       for(int i = 0;i<n;i++){
           for(int j=0;j<m;j++){
               System.out.print("Enter the elements: ");
               arr[i][j] = sc.nextInt();
            }
       }
       int maxWealth = 0;
       for(int[] customer : arr){
           int sum =0;
        for(int bank : customer){
            sum += bank;
        }
        maxWealth = Math.max(maxWealth,sum);
       }
       System.out.println("MAxWealth : "+maxWealth);
    }
}
