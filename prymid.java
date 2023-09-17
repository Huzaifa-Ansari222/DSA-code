public class prymid {

    public static void main(String[] args) {

//            void prt();
//
//    }
//     static void prt() {
            int i, j, k;

            for (i = 1; i <= 5; i++) //outer loop
            {
                for (j = 4; j >= i; j--)  //inner loop for space
                {
                    System.out.print(" ");
                }
                for (k = 1; k <= i; k++)  //inner loop for print
                {
                    System.out.print("* "); //here if add space then it will become pyramid
                }
                System.out.print("\n");
            }
        }
    }

