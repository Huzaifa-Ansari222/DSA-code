public class asscendingORdescending {
    public static void main(String[] args) {
        int aar[] = {5,4,3,2,1};//give input assending or descending
        int target = 5;
        int ans = bFunction(aar, target);
        System.out.println(ans);

    }

    static int bFunction(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];//samething
//        if(arr[start]<arr[end]){
//            isAsc=true;
//        }
//        else {
//            isAsc=false;
//        }same thing

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;//answer
            }//common in both
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            }//isAc
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }//isAsc

        }//while
        return -1;//when nothing exceute means not found

    }
}
