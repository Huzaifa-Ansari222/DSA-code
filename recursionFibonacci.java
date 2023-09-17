public class recursionFibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        //base case
        if(n<2){
            return 1;
        }
        else
        {
            return fibo(n-1)+fibo(n+2);
        }
    }
}
