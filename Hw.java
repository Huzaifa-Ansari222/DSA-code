public class Hw {
    public static void main(String[] args) {
        int a=22;
        int b=3;
        int c=4;
        int min=0;
         if(b>a || c>a){
             min=a;
         }
        if(min>b || c>b)
        {
            min=b;
        }
        if(min>c)
        {
            min=c;
        }
        System.out.println("youngest age is :"+min);
    }
}
