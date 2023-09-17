package RecursionPart1;

public class Recursion {
    public static void main(String[] args) {
        int n;
        function(5);
    }
    static int function(int n){
        //System.out.println(n);
        if(n==0){
            return 1;
        }
        function(n-1);
        System.out.println(n);

        return n;

    }
}
