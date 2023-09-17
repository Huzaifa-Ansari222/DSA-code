public class PractiseBinarySearch {


    public static void main(String[] args) {
        int []arr={-1,3,45,65,67,87,90,100};
        int target=67;
        int ans =searching(arr,target);//fn call take arr and target
        System.out.println(ans);
    }
    static int searching(int []arr,int target)//fn definetion where ask for  arr[] and target
    {
        int start =0;//index start from 0
        int end =arr.length;//last range of array
        while(start<=end){//low is lessthan or = high
//          int  mid=start+end/2 thi may exceed from the range if bigger value come
            int mid =start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;//target is in left side of mid
            }
            else if (target>arr[mid]) {
                start=mid+1;//target is in right side of mid
            }
            else {
                System.out.print(arr[mid]+" is Found in index: ");
                return mid;//ans found
            }
        }

        System.out.println("value not in list");
        return -1;//means not present in list
    }
}