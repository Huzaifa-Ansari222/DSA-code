import java.util.Arrays;

public class arrayPassingFuntion {
    public static void main(String[] args) {
    int[]num={1,2,3,4};
        System.out.println(Arrays.toString(num));//1,2,3,4
        func(num);//changable in array becoz it object base perimitive
        System.out.println(Arrays.toString(num));//0,2,3,4

    }
    static void func(int[]arr){
        arr[0]=0;
    }
}
