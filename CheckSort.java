package RecursionPart1;

public class CheckSort {
    public static void main(String[] args) {
        int arr[]={1,0,6,3,4};
        System.out.println(check(arr,5));
    }
    static boolean check(int arr[],int index){
        if (arr.length==0 || arr.length==1)
        {
            return true;
        }
        if (arr[0] < arr[1]){
            return true;
        }
        if (arr[0] > arr[1]){
            return false;
        }

        return check(arr,index+1);


            }
}
