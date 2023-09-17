public class binary2search {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,18,20};
        int target = 18;
        int ans= BSfunction(arr,target);
        System.out.println(ans);
    }
   static int BSfunction(int arr[], int target) {
        int end = arr.length-1;
        int start = 0;
        while (start <= end) {//low is lessthan or = high
           int  mid = start + (end-start) / 2;
            if (target >arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                System.out.print(arr[mid]+" is Found in index: ");
                return mid;//ans found
            }
        }
       System.out.println("value not in list");
       return -1;
    }
}