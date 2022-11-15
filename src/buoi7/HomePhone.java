package buoi7;

import java.util.Scanner;

public class HomePhone extends Phone {
    private int lineleght;

    public HomePhone(String name, int price, String manufacturer, int lineleght) {
        super(name, price, manufacturer);
        this.lineleght = lineleght;
    }

    public HomePhone() {

    }

    public int getLineleght() {
        return lineleght;
    }

    public void setLineleght(int lineleght) {
        this.lineleght = lineleght;
    }


    @Override
    public void nhapThongTin() {
        Scanner in = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("lineLegnt: ");
        this.lineleght = in.nextInt();

    }


    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("lineLeght: "+lineleght);
    }
}
