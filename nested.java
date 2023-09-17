import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        int year;

        Scanner sf=new Scanner(System.in);

        System.out.println("ENTER DEPRATMENT:");
       String dept=sf.nextLine();
//        String name=dept ;
        if (dept.contains("IT"))
        {
            System.out.println("ENTER YEAR:");
            year= sf.nextInt();
            if (year==1){
                System.out.println(dept+" department "+year+" year ");
            }
            else if (year==2) {
                System.out.println(dept+" department "+year+" year ");

            }
            else if (year==3) {
                System.out.println(dept+" department "+year+" year ");

            }
            else if (year==4) {
                System.out.println(dept+" department "+year+" year ");

            }
            else{
                System.out.println("invalid choice");
            }

        }
        else if (dept.contains("CSE")) {
            System.out.println("ENTER YEAR:");
            year = sf.nextInt();
            if (year == 1) {
                System.out.println(dept + " department " + year + " year ");
            }
            else if (year==2) {
                System.out.println(dept+" department "+year+" year ");

            }
            else if (year==3) {
                System.out.println(dept+" department "+year+" year ");

            }
            else if (year==4) {
                System.out.println(dept+" department "+year+" year ");

            }
            else {
                System.out.println("invalid choice");
            }
        }
        else{
            System.out.println("invalid choice");
        }

    }
}
