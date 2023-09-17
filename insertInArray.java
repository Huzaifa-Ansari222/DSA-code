import java.util.Scanner;

public class insertInArray {
    public static void main(String[] args) {

        Scanner sf=new Scanner(System.in);
        System.out.print("enter the size of array length :");
       int n= sf.nextInt();
        int []arr=new int [n];

        System.out.print("enter the array element :");

        for (int i = 0; i < arr.length; i++) {
           arr[i] =sf.nextInt();
        }
//        System.out.println("array list:");
//        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(" "+arr[i]);
//        }
        System.out.print("enter position of element :");
        int pos= sf.nextInt();
      int  index=pos-1;
        System.out.println("enter element you want to insert in the array list");
        int ele= sf.nextInt();
        for (int i = arr.length-1; i <pos-1 ; i--) {
            arr[i+1]=arr[i];
            
        }
        arr[pos-1]=ele;
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(" "+arr[i]);
        }
    }
    
}
