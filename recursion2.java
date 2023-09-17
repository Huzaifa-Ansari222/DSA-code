public class recursion2 {
    //print 1 to 5 with using recursion
    public static void main(String[] args) {
         function(1);

    }
     static void function(int n){
        System.out.println(n);
        function2(2);

    }
    static void function2(int n){
        System.out.println(n);
function3(3);
    }
    static void function3(int n){
        System.out.println(n);
function4(4);
    }
    static void function4(int n){
        System.out.println(n);
function5(5);
    } static void function5(int n){
        System.out.println(n);

    }


}
