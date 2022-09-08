import java.util.Arrays;

public class LinearSearchString {
    public static void main(String[] args) {
        String name = "huzaifa";
        char key = 'v';

        System.out.println(search(name,key));//give input in fucntion huzaifa & v
        System.out.println(Arrays.toString(name.toCharArray()));//going to print char array
    }
    static boolean search(String name, char key)
    {

//        if (name.length() == 0) {
//            return false;
//           }
        for (char ch : name.toCharArray()) {//its change string to char array ex:  string->char[h,u,z,a,i,f,a]
            if (ch==key)
            {
                return true;
            }
//return false;
        }
        return false;
    }
    static boolean search2(String name, char key) //name=huzaifa &key=v take input from fucntion calll parameter
    {

//        if (name.length() == 0) {
//            return false;
//        }
        for (int i = 0; i < name.length(); i++) {
            if (key==name.charAt(i)) //to get charchater at any particular string we use charAt
            {
                return true;
            }
//return false;
        }
                return false;
    }
}

