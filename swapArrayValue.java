import java.util.Arrays;

public class swapArrayValue {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        swap(arr,1,3);//we r send arrays and index value
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr, int index1, int index2)//recived array and index value
    {
        //swap
        int temp =arr[1];
        arr[1]=arr[3];
        arr[3]=temp;

    }
}
