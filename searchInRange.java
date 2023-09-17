public class searchInRange {
    public static void main(String[] args) {
        int []arr={12,34,56,13,99,100};//0,1,2,3,4,5
        int target=100;
        int start =1;
        int end=4;
        int ans=LinearSearch(arr,target,start,end);
        System.out.println(ans);
    }
    static int LinearSearch(int []arr,int target,int start ,int end){
        if(arr.length==0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element=arr[index];
            if(element== target)
            {
                return index ;
            }

        }
        //none exceute mean nonthing dound
        return -1;
    }

}
