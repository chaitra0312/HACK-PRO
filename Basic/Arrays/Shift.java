import java.util.*;
class Shift {
 public static int[] createTargetArray(int[] nums, int[] index) {
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        list.add(index[i],nums[i]);
    }
    int[] target = new int[nums.length];
    for(int i=0;i<nums.length;i++){
        target[i] = list.get(i);
    }
    return target;
}
}
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the Index Array: ");
        int[] index=new int[n];
        for(int i=0;i<n;i++){
            index[i] = sc.nextInt();
        }
        int[] result = Shift.createTargetArray(nums,index);
        System.out.println("Target" );
        for(int x : result){
            System.out.print(x+" ");
        }
    }
}
