
package sumof1;

import java.util.Scanner;
 
public class SumOf1{
    public static void main(String[] args) {
     int ans =additionOf();//function call    .....1
        System.out.println(ans);//print function value.......4
}
    
    static int additionOf(){//return type int   .....2
        Scanner in=new Scanner(System.in);//calling scanner function
        System.out.println("enter 1st no:");
        int num1=in.nextInt();//take input
         System.out.println("enter 2nd no:");
        int num2=in.nextInt();
       int sum=num1+num2;//operation
     return sum;//return vale int........3
    }
    
}