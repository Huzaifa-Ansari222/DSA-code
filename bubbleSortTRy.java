import java.util.Arrays;

public class bubbleSortTRy {
    public static void main(String[] args) {
//        int []arr ={1,2,3,4,5};
        int []arr =   {0, 2, 1, 2, 0};
        int n;
      //  int []arr ={-1,-5,0,1,-4,2,3,4,5};
        function(arr);
        System.out.println(Arrays.toString(arr));//print all the arr

    }
  static void  function(int[] arr){//void becoz its doesnt return any new arry it just sort ita
        boolean swapped;//
        for (int  i = 0; i <= arr.length-1; i++) {//or i<arr.length
           swapped=false;//no swap done  and outer loop run 1 time n give boolean false;
            for (int j =1; j <= arr.length-i-1 ; j++) {//or j<arr.length-i
 /*  j-1=4 > j=2*/               if(arr[j]<arr[j-1]){// j and j-1 travel  j-1 and compare if small or not  where j-1 is behind the j
                   //swaping
                    int temp =arr[j]; //j <- temp
                    arr[j]=arr[j-1];//j value goes in j-1 / j  <-  j-1
                    arr[j-1]=temp;// j-1 <- temp
                    swapped=true;//swap done tilll here
                }

            }
            if(swapped==false)//or use like !swapped means/!false give me true
            {
                break;
            }
        }

    }
}
