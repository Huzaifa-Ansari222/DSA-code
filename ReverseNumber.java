package RecursionPart1;

public class ReverseNumber {
    static int sum=0;

    public static void main(String[] args) {
       rev(1234);
        System.out.println(sum);
    }
    static void rev(int n)//1234
    {

        if(n==0){
            return;
        }
        int rem=n%10;//4
        sum=sum*10+rem;//4.........all answer were save in sum
        rev(n/10);//123
    }
}
