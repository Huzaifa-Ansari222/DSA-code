public class maxInArray {
    public static void main(String[] args) {
        int []arr={1,3,4,53,4};
        max(arr);
    }
    static void max (int arr[]){
      int max=arr[0];
        for (int i = 0; i <arr.length;i++) {
           // max=0;
if (arr[i]>max){
    max=arr[i];
            }
        }
     System.out.println(max);
    }

}
