package buoi7;

import java.util.Scanner;

public class Phone {
    private String name;
    private int price;
    private String manufacturer;

    public Phone(String name, int price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void nhapThongTin(){
        Scanner in = new Scanner(System.in);
        System.out.println("nhap name :");
        this.name = in.nextLine();
        System.out.println("nhap pice : ");
        this.price = in.nextInt();
        System.out.println("nhap manufacturer : ");
        this.manufacturer = in.nextLine();
        in.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("name: "+name);
        System.out.println("pice : "+price);
        System.out.println("manufacturer: "+manufacturer);

    }
}
