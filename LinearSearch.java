public class LinearSearch {

    public static void main(String[] args) {

       String ans= linear(2);
        System.out.println(ans);
    }
    static String linear(int a){
int []arr={2,46,63,2,25,};
int key =a;
        for (int i = 0; i < arr.length; i++) {


            if ( arr[i]==key)
            {
                return "found";
            }
        }
return "not found";
    }
}
