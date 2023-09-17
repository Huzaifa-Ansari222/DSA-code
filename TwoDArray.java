import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int i,j,n,m;
//        int[] arr=new int[]
        System.out.println("enter your array row and colum resp:");
        Scanner sf=new Scanner(System.in);
        n=sf.nextInt();
        m=sf.nextInt();
        int[][] arr=new int[n][m];
        System.out.println(n+"x"+m+" size array");//end print loop
        System.out.println("enter your array elements:");
        for (i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print("[a"+i+","+j+"]=");
                arr[i][j]=sf.nextInt();
            }
        }//end input  loop

        for (i=0;i<n;i++){
            System.out.print("\t");
            for(j=0;j<m;j++){

                System.out.print(" "+arr[i][j]+",\t");
            }
            System.out.println("\t");
        }
//        System.out.print(n+"x"+m+"matrix");//end print loop
    }
}
