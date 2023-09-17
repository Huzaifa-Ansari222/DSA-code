package RecursionPart1;

public class PassConcept {
    public static void main(String[] args) {
    int n;
    fun(5);
        ;
    }
    static void fun(int n){
        if(n==0) {
            return ;
        }
        System.out.println(n);
        //fun(n--) //pass then minus
        fun(--n);//minus then pass
    }
}
