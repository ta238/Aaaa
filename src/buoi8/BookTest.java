package buoi8;

import buoi7.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class BookTest {

    public static void main(String[] args) {


        List<Book> list = new ArrayList<>();
        list.add(new Book());
        list.add(new Book());
        list.add(new Book());
        list.add(new Book());
        list.add(new Book());
        list.add(new Book());
        list.add(new Book());
        list.add(new Book());
        list.add(new Book());
        list.add(new Book());
        list.stream().filter(B -> {
            B.getName();
            return true;
        }).toList();
        for (Book book1 : list) {
            System.out.println("NHAP HONG TIN VA HIEN THI");
            book1.nhapThongTin();
            book1.hienThiThongTin();
        }

        list.stream().filter(t -> {
            if (t.getPrice() < 100000) {
                return true;
            } else {
                return false;
            }

        }).toList();
        for (Book book : list) {
            System.out.println("PRICE <1000");
            book.hienThiThongTin();
        }

    }
}
