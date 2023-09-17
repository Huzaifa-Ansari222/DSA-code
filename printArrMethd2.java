import java.util.*;
public class printArrMethd2 {
    public static void main(String[] args)
    {
int arry[][]={
        {1,2,3,},
        {4,5},
        {6,7,8,9}
        };
        for (int row = 0; row < arry.length; row++) {
            for (int col = 0; col < arry[row].length; col++) {//individual ammout of row we need that
                //amount of colums like 3row then 3 col same as 2 row 2 colms

                System.out.print(arry[row][col]+" ");
            }
            System.out.println("");

        }
    }
}
