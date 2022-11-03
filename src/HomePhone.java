import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Supplier;

public class HomePhone extends Phone {
   private int linelegnht;


    public int getLinelegnht() {
        return linelegnht;
    }

    public void setLinelegnht(int linelegnht) {
        this.linelegnht = linelegnht;
    }

public HomePhone(){

}

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("linelegnht"+linelegnht);
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner in = new Scanner(System.in);
        System.out.println("nhap  linelegnht:");
        this. linelegnht = Integer.parseInt(in.nextLine());

    }

}
