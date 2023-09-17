//import java.util.Scanner;
import java.util.*;
public class findInArray {
    public static void main(String[] args) {
        int i, n;
        Scanner sf = new Scanner(System.in);//create sf
        System.out.println("enter arry size");
        n = sf.nextInt(); // n take input of size
        int[] aryr = new int[n];//initailize and declare aryr

        System.out.println("ENTER YOUR ARRAY ELEMENT:");
        for (i = 0; i < n; i++) {
            aryr[i] = sf.nextInt();//input from sf and store in aryr
        }
        for (i = 0; i < n; i++) {
            System.out.println(aryr[i]);
        }
        int search;
        System.out.println("enter search element");
        search = sf.nextInt();
        for (i = 0; i < n; i++) {
            if (aryr[i] == search) {
                System.out.println("found in"+(i+1)+" position");
                return;
            }
        }
        System.out.println("not foound");

    }
}


