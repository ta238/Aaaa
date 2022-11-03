package buoi5;

import java.util.Scanner;

public class HomePhone extends Phone {
    private int lineLeght;
    Scanner scanner = new Scanner(System.in);

    public HomePhone(String name, double prince, String manufacturer) {
        super(name, prince, manufacturer);
    }
public HomePhone(){

}
    public int getLineLeght() {
        return lineLeght;
    }

    public void setLineLeght(int lineLeght) {
        this.lineLeght = lineLeght;
    }

    @Override
    public void nhapThongTin() {
        System.out.println("home phone");
        super.nhapThongTin1();
        System.out.println("lineleght:");
        this.lineLeght = scanner.nextInt();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(getName());
        System.out.println(getPrince());
        System.out.println(getManufacturer());
        System.out.println(lineLeght);
    }
}
