import java.util.Arrays;

public class MaxItems {
    public static void main(String[] args) {
    int []arr={100,2,10,4,5000};
//        max(arr);
        System.out.println(max(arr));


    }
    static int max(int[]arr)
    {
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
//        System.out.println(max);


    }
}
