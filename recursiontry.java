public class recursiontry {
    public static void main(String[] args) {
        function(1);
    }
    static void function(int n){
        if(n==6){//if not use then overflow 0r base condition where stop making call
            return ;
        }
        System.out.println(n);
        function(n+1);
    }
}
