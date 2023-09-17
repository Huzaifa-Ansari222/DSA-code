import java.util.Arrays;
import java.util.Scanner;

public class a2dArray {
    public static void main(String[] args) {
        /*
        11  12  13
        21  22  23
        31  32  33
        */
//        int[][]arr=new int [3][3]//row*colm ...colm  size not imp to give
        //becoz 11  12  13
        //        21  22
        //        31  32  33
        //        sometime col may be diff
        Scanner sc=new Scanner(System.in);

/*
        int [][] arr={
              //  it is array of array itself [  [0],[1],[3]  ]
                {11,12,13},//index 0  {0,1,2}  arr[0][1], [0][2], [0][3]
                {21,22,23},//index 1 {0,1,2}  arr[1][1], [1][2], [1][3]
                {31,32,33}//index 2  {0,1,2}  arr[2][1], [2][2], [2][3]
        };
*/
        int [][]arr=new int[3][3];
       // System.out.println(arr.length);//3 print row here
        //input
        for (int row = 0; row < arr.length; row++) {//row
            //for each colm in every row
            for (int col = 0; col < arr[row].length; col++) {//har row ka max len {123},{2,3},{3,2,1}
            arr[row][col]=sc.nextInt();
            }
        }
        //print
//        for (int row = 0; row < arr.length; row++) {//row
//            //for each colm in every row
//            for (int col = 0; col < arr[row].length; col++) {//har row ka max len {123},{2,3},{3,2,1}
//                System.out.println(Arrays.toString(arr[row]));
//            }
//        }
        for(int[] print:arr){
            System.out.println(Arrays.toString(print));//print the whole 2d array enchance methoda
        }

    }

}
