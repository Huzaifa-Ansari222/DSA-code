import java.util.Arrays;

public class GGsortArrayof0ssAnd2s {
    public static void main(String[] args) {
        int a[] = {0, 2, 1, 2, 0};
        int n = 5;
        sort012(a, n);
        // System.out.println(sort012(a,n));
        System.out.println(Arrays.toString(a));
    }

    public static void sort012(int a[], int n) {
        // code here
        boolean swapped;
        for (int i = 0; i<a.length; i++) {
            swapped=false;
            for (int j = 1; j <a.length-i; j++) {
                if (a[j - 1] > a[j]) {
                    int swap = a[j-1];
                    a[j - 1] = a[j];
                    a[j] = swap;
                }
            }

            if(swapped==false)//or use like !swapped means/!false give me true
            {
                break;
            }
        }
    }
}
