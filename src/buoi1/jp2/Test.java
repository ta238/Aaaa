package buoi1.jp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Student> list=new ArrayList<>();

        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        System.out.println("1 nhap thong tin");
        System.out.println("hien thi thong tin");
        System.out.println("thoat");
        int chon=Integer.parseInt(in.nextLine());
        while (true){
            if (chon==1){
                for (Student s:list) {
                    s.nhapThongTin();
                }

            } else if (chon==2) {
                for(Student s:list)
                s.hienThiThongTin();
            }else {
                System.out.println("thoat");
            }
        }

    }
}