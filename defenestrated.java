




import java.util.Scanner;
public class defenestrated {

    public static void main(String[] args) {
//        String dept;
        int year;
      String dept;
        Scanner ob = new Scanner(System.in);

        System.out.println("Choose your dept ");
        dept = ob.nextLine();
        System.out.println("choose your years");
        year = ob.nextInt();


//        CSE=ob.nextLine();
//        IT=ob.nextLine();
        if (dept == "CSE") {
            System.out.println("CSE department");
            if (year == 1) {
                System.out.println("1st year of CSE department");
            } else if (year == 2) {
                System.out.println("2nd year of CSE department");
            } else if (year == 3) {
                System.out.println("3rd year of CSE department");
            } else if (year == 4) {
                System.out.println("4th year of CSE department");
            }

        }//cse

//        else if(dept)
         else   if (dept == "IT") {

                if (year == 1) {
                    System.out.println("1st year of IT department");
                } else if (year == 2) {
                    System.out.println("2nd year of IT department");
                } else if (year == 3) {
                    System.out.println("3rd year of It department");
                } else if (year == 4) {
                    System.out.println("4th year of it department");
                }

            }
//
//else
//        {
//            System.out.println("invalid choose");
//        }
//

       else
        {
            System.out.println("invalid choose");
        }//esle
    }//main
}//Main