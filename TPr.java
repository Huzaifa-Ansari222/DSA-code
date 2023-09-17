import java.util.Scanner;

public class TPr {
    public static void main(String[] args) {
        do {
            System.out.println(">>>ITEM<<<");
            System.out.print("1.shirt\n2.pant\n3.kurta\n0.EXIT:\n");
            System.out.print("OPTION:");
            bond.costumerDetails();
            bond.item();
        }
    }
    }
class bond{
    String name;
    int pho;
    String address;

    static void costumerDetails(){
         bond obj=new bond();
        Scanner sf=new Scanner(System.in);

        System.out.print("NAME:");
        obj.name=sf.nextLine();

        System.out.print("PHONE NO:");
        obj.pho=sf.nextInt();

        System.out.print("ADDRESS:");
        obj.address=sf.nextLine();

        System.out.println("NAME:"+obj.name);
        System.out.println("PHONE NO:"+obj.pho);
        System.out.println("ADDRESS:"+obj.address);
            }

    static void item() {
        Scanner sf = new Scanner(System.in);
        System.out.println(">>>ITEM<<<");
        System.out.print("1.shirt\n2.pant\n3.kurta\n0.EXIT:\n");
        System.out.print("OPTION:");
        int take = sf.nextInt();
        //while (take< 0) {
            switch(take) {
                case 1:
                    System.out.println(">>>SHIRT<<<");
                    System.out.println("shoulder size:");
                    int a=sf.nextInt();
                    System.out.println("sleeve size");
                    int b=sf.nextInt();
                    System.out.println("length");
                    int c=sf.nextInt();
                    System.out.println("1.Want to add Note:\n0.Exit");
                    int note=sf.nextInt();
                    if(note==1) {

                        System.out.print("NOTE:");
                        String write=sf.nextLine();
                        System.out.println("NOTE:"+write);
                    }
                    else{
                        break;
                    }
                   break;
                case 2:
                    System.out.println("PANT");
                    System.out.println("waist size:");
                    int l=sf.nextInt();
                    System.out.println("thigh size");
                    int m=sf.nextInt();
                    System.out.println("insigh size");
                    int n=sf.nextInt();
                    System.out.println("length");
                    int o=sf.nextInt();
                    break;
                case 3:
                    System.out.println("KURTA");
                    System.out.println("shoulder size:");
                    int z=sf.nextInt();
                    System.out.println("sleeve size");
                    int y=sf.nextInt();
                    break;
            }
        }
    }



