public class hw2 {
    public static void main(String[] args) {
        int n=20;
        if(n%5==0 && n%3!=0){
            System.out.println( +n+" can be divided by 5 but not by 3");
        }
//

        else if(n%5==0 && n%3==0){
            System.out.println("it can divided by 5 & 3 both");
        }
        else{
            System.out.println("nor divided by 5 & 3");
        }
    }
}
