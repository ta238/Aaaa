import javax.management.Query;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.nhap thong tin");
        System.out.println("2.hien thi thong tin");
        System.out.println("3. thoat");
        String nanme="";
        String addr="";
        int age=0;
        int chon = Integer.parseInt(scanner.nextLine());
        switch (chon){
            case 1:
                System.out.println("nhap ten ");
                nanme= scanner.nextLine();
                System.out.println("nhap tuoi");
                age = Integer.parseInt(scanner.nextLine());
                System.out.println(" nhap dia chi");
                addr= scanner.next();
                break;
            case 2:
                String msg=String.format("hello %s, your live in %s,in your age is %s",nanme,addr,age);
                System.out.println(msg);
                break;
            case 3:
                System.out.println("bye...");
                break;
            default:
                System.out.println(" phhai chon 1.2.3...");


        }
    }
}