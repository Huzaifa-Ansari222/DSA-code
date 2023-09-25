public class cellingBT {
    public static void main(String[] args) {
        int []arr={1,8,10,30,42,51};
        int target=31;
        int ans=function(arr ,target);
        System.out.println(ans);
    }
    static int function(int []arr , int target){
        int start=0;
        int end = arr.length - 1;

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
        return start;//when nothing exceute means not found
    }
}
