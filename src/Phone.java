import java.util.Scanner;

public class Phone {

    static String name;
    float prince;
    String manufacturer;


public Phone(){

}

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Phone.name = name;
    }

    public float getPrince() {
        return prince;
    }

    public void setPrince(float prince) {
        this.prince = prince;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void nhapThongTin() {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap name:");
        this.name = in.nextLine();
        System.out.println("nhap prince:");
        this.prince = in.nextFloat();
        System.out.println("nhap manufacturer:");
        this.manufacturer = in.nextLine();
        in.nextLine();
    }

    public void hienThongTin() {
        System.out.println("name" + name);
        System.out.println("prince" + prince);
        System.out.println("manufacturer" + manufacturer);
    }
}