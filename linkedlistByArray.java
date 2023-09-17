import java.util.LinkedList;
import java.util.Scanner;

public class linkedlistByArray {
    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);
        LinkedList<Integer>list=new LinkedList<>();
        System.out.print("add elements: ");
        list.add(10);//0
        list.add(20);//1
        list.add(40);//2
        System.out.println(list);
        System.out.print("remove index 2: ");
        list.remove(2);
        System.out.println(list);
        System.out.print("add element in 2 index: ");
        list.add(2,30);
        System.out.println(list);
        list.addFirst(9);
        list.addFirst(8);
        list.addFirst(7);
        System.out.print("add element at first : ");
        System.out.println(list);
        list.addLast(40);
        list.addLast(50);
        System.out.print("add at last : ");
        System.out.println(list);

        System.out.print("how many element you want to add : ");
        int x= sf.nextInt();
        System.out.println("enter"+x+"elements: ");
        for (int i = 0; i < x; i++) {
            //Scanner sf=new Scanner(System.in);
            int n=sf.nextInt();
            list.add(n);
        }
        System.out.println(list);
    }

    }

