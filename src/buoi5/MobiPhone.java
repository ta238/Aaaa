package buoi5;

import java.util.Scanner;

public class MobiPhone extends Phone {
    String operatingSystem;

    public MobiPhone(String name, double prince, String manufacturer) {
        super(name, prince, manufacturer);
    }
public MobiPhone(){

}
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void nhapThongTin() {
        Scanner in = new Scanner(System.in);
        System.out.println("MoBiPhone");
        super.nhapThongTin1();
        System.out.println("nhap operatingSystem:");
        this.operatingSystem = in.nextLine();

    }

    @Override
    public void hienThiThongTin() {
        System.out.println(getName());
        System.out.println(getPrince());
        System.out.println(getManufacturer());
        System.out.println(operatingSystem);
    }
}
