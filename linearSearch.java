public class linearSearch {
    public static void main(String[] args) {
        int []arr={12,34,56,13};
        int target=13;
        int ans=LinearSearch(arr,target);
        System.out.println(ans);
    }
    static int LinearSearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
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
