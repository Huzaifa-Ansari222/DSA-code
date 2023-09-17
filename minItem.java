public class minItem {
    public static void main(String[] args) {
        int[]arr={11,111,15,15,5,15};
        int ans=min(arr);
        System.out.println(ans);
    }
    static int min(int []arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
