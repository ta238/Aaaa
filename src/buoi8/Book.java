package buoi8;

import java.util.Scanner;

public class Book {
    // isbn, name, author, price.
    private String isbn;
    private String name;
    private String author;
    private double price;

    public Book(String isbn, String name, String author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void nhapThongTin(){
        Scanner in = new Scanner(System.in);
        System.out.println("nhap isbn");
        this.isbn = in. nextLine();
        System.out.println("nhap name: ");
        this.name = in.nextLine();
        System.out.println("nhap author: ");
        this.author = in.nextLine();
        System.out.println("nhap price: ");
        this.price = in.nextDouble();
    }
public void hienThiThongTin(){
        System.out.println("isbn:"+isbn);
    System.out.println("name:"+name);
    System.out.println("author:"+author);
    System.out.println("price:"+price);
}

}
