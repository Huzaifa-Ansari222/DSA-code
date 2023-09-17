import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of aarrray length:");
        int n = sc.nextInt();
        int []arr=new int[n];

        System.out.println("Enter "+n+" array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
//        for ( int i = 0; i < arr.length; i++) {normal way to print
//            System.out.print( arr[i] +" " );
////        }
//        for (int j : arr) {//enhanced forloop
//            System.out.print(j + " ");
//        }
        System.out.println(Arrays.toString(arr));//3rd wway to print array
    }
}