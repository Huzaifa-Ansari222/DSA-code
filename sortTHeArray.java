import java.util.Scanner;

public class sortTHeArray {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sf = new Scanner(System.in);
        System.out.println("enter size of array:");
        n = sf.nextInt();
        System.out.println("enter array element:");
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sf.nextInt();
        }//end loop
        System.out.println("UNSORT ARRAY :");
        for (i = 0; i < n; i++) {
//            System.out.println(arr[i]);
            for (j = 0; j < n; j++) {
                System.out.println(arr[j]);
            }
            if (arr[i] > arr[j]) {
                int temp = arr[j];
                arr[i] = arr[j];

            }
        }
    }
}

