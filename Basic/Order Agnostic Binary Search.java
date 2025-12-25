class Main {
    static int OrderBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAce = arr[start]  < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            } if(isAce){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                 } 
                 } else {
                     if(target < arr[mid]){
                         start = mid + 1;
                     } else {
                         end = mid-1;
                     }
                 }
            }
        return -1;
    }
    public static void main(String[] args) {
       int arr[] = {9,8,7,6,4,3};
       int target = 6;
       int ans = OrderBinarySearch(arr,target);
       System.out.print(ans);
    }
}
