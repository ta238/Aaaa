package buoi5;

import java.util.Scanner;

public class HomePhone extends Phone {
    private int lineLeght;
    Scanner scanner = new Scanner(System.in);

    public HomePhone(String name, double prince, String manufacturer) {
        super(name, prince, manufacturer);
    }

    public HomePhone() {

    }

    public int getLineLeght() {
        return lineLeght;
    }

    public void setLineLeght(int lineLeght) {
        this.lineLeght = lineLeght;
    }

    @Override
    public void nhapThongTin() {

        System.out.println("name:");
//        String name = scanner.nextLine();
//        setName(name);
        setName(scanner.nextLine());
        System.out.println("price");
        double prince = scanner.nextDouble();
        setPrince(prince);
        System.out.println("manufacturer:");
//        String manufacturer = scanner.nextLine();
//        setManufacturer(manufacturer);
        setManufacturer(scanner.nextLine());
        scanner.nextLine();
        System.out.println("lineleght:");
        this.lineLeght = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("name" + getName());
        System.out.println("prince" + getPrince());
        System.out.println("manufacturer" + getManufacturer());
        System.out.println("lineleght" + lineLeght);
    }

}
