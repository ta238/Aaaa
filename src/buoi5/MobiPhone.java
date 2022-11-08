package buoi5;

import java.util.Scanner;

public class MobiPhone extends Phone {
    String operatingSystem;
    Scanner scanner = new Scanner(System.in);
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
        System.out.println("name:");
        String name=scanner.nextLine();
        setName(name);
        System.out.println("price");
        double prince = scanner.nextDouble();
        setPrince(prince);
        System.out.println("manufacturer:");
        String manufacturer = scanner.nextLine();
        scanner.nextLine();
        setManufacturer(manufacturer);
        System.out.println("nhap operatingSystem:");
        this.operatingSystem = scanner.nextLine();

    }

    @Override
    public void hienThiThongTin() {
        System.out.println("name:"+getName());
        System.out.println("price:"+getPrince());
        System.out.println("mamufacturer"+getManufacturer());
        System.out.println("operatingSystem"+operatingSystem);
    }
}
