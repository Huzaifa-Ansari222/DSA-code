public class floorBT {
    public static void main(String[] args) {
        int []arr={1,8,10,30,42,51};
        int target=0;
        int ans=function(arr ,target);
        System.out.println(ans);
    }
    static int function(int []arr , int target){
        int start=0;
        int end = arr.length - 1;
        if(target < arr[arr.length-1]){
            return -1;
        }

        while(start<= end){
            int mid= start + (end - start ) / 2;
            if(target < arr[mid]){
                end=mid-1;

            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                return mid;//return answer
            }
        }
        return end;//when nothing exceute means not found
    }
}
