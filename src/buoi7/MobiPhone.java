package buoi7;

import java.util.Scanner;

public class MobiPhone extends Phone{
    private String operatingSystem;

    public MobiPhone(String name, int price, String manufacturer, String operatingSystem) {
        super(name, price, manufacturer);
        this.operatingSystem = operatingSystem;
    }

    public MobiPhone() {

    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    @Override

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner in = new Scanner(System.in);
        System.out.println("nhap operatingSystem: ");
        this.operatingSystem = in.nextLine();
    }


    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("operatingSystem: "+operatingSystem);
    }
}
