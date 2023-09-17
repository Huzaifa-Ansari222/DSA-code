package RecursionPart1;

public class linearSearcch {
    public static void main(String[] args) {
int arr[]={2,3,1,18,9};
        System.out.println(find(arr,9,0));
        System.out.println(findi(arr,55,0));
    }
    //using boolean as result

    static boolean find(int arr[],int target,int index){
        if(index==arr.length){
            return false;//no target found
        }
        return arr[index]==target || find(arr, target, index+1);//if array elelment doesnt =targent then index+1
    }
    //using integer as result
    static int findi(int arr[],int target,int index){
        if(index==arr.length){
            return -1;//no target found
        }
        if  ( arr[index]==target) {
        return 1;
        }
            else {
                return findi(arr, target, index+1);//if array elelment doesnt =targent then index+1
    }
    }
}
