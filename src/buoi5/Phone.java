package buoi5;

import javax.xml.namespace.QName;
import java.util.Scanner;

public abstract class Phone {
    private String name;
    private double prince;
    private String manufacturer;

    public abstract void nhapThongTin();

    public abstract void hienThiThongTin();

    public Phone(String name, double prince, String manufacturer) {
        this.name = name;
        this.prince = prince;
        this.manufacturer = manufacturer;
    }

    public Phone() {

    }

    public void nhapThongTin1() {
        Scanner in = new Scanner(System.in);
        System.out.println("phone");
        System.out.println("name:");
        this.name = in.nextLine();
        System.out.println("prince:");
        this.prince = in.nextDouble();
        System.out.println("manufacturer:");
        this.manufacturer = in.nextLine();
in.nextLine();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}


