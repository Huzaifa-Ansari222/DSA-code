package RecursionPart1;

public class Count00 {
   static int count=0;
    public static void main(String[] args) {
        int n,search;
       fun(1020,0);
        System.out.println(count);
    }
    static int fun(int n,int search) {//12030
    if (n == 0) {
            return count;
        }
        int rem ;
    rem=n%10;
        if(rem==0){
         count++;
            }

        return fun(n/10,0);
    }
}
