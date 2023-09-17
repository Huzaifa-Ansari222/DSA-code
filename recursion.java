public class recursion {
    public static void main(String[] args) {
        function();
    }

    static void function() {
        System.out.println("hi1");
        function2();
       // function4();
    }

    static void function2() {
        System.out.println("hi2");
        function3();
    }

    static void function3() {
        System.out.println("hi3");
        function4();
    }

    static void function4() {
        System.out.println("hi4");
    }
}