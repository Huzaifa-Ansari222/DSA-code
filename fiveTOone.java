package RecursionPart1;

public class fiveTOone {
    public static void main(String[] args) {

        function(5);
    }
    static void function(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        function(n-1);
        //System.out.println(n); //12345 excute after 14line

    }
}
