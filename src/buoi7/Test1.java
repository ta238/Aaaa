package buoi7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Phone> list = new ArrayList<>();
        list.add(new HomePhone());
        list.add(new HomePhone());
        list.add(new MobiPhone());
        list.add(new MobiPhone());

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("1. Nhap thong tin: cho phép nhập thông tin các phần tử của mảng Phone");
            System.out.println("2. Hien thong tin: hiển thị thông tin các phần tử của mảng Phone");
            // y 3 ,4 dung lambda
            System.out.println("3. Tìm kiếm các phone có name là giá trị nhập từ bạn phím, sau đó hiển thị");
            System.out.println("4. Hiển thị all phone có giá tiền > 1trieu");
            System.out.println("5. thoat");
            int chon = Integer.parseInt(in.nextLine());
            if (chon == 1) {
                for (Phone phone : list) {
                    phone.nhapThongTin();
                }
            } else if (chon == 2) {
                for (Phone phone : list) {
                    phone.hienThiThongTin();
                }
            } else if (chon == 3) {
                System.out.println("Nhập tên phone cần tìm kiếm:");
                String name = scanner.nextLine();

                // result là ket qua tim kiem
                // Tương tự câu lệnh sau
                // ArrayList<Phone> result = new ArrayList<>();
                // for(int i = 0; i < list.size(); i++) {
                //     if(phone.getName() == name) {
                //           result.add(list.get(i));
                //     }
                //  }

                List<Phone> result = list.stream().filter(phone -> {
                    // kiểm tra nếu phone này có name = name nhập từ bàn phím
                    // thì trả về true (true thì nó sẽ sẽ thêm vào kết quả, false thì sẽ bị bỏ qua)
                    if (phone.getName() == name) {
                        return true;
                    } else {
                        return false;
                    }
                }).toList();

                for (Phone phone : result) {
                    phone.hienThiThongTin();
                }

            } else if (chon == 4) {
                System.out.println("hien thi all dien thoai > 1tr");
                list.stream().filter(phone -> {

                    if (phone.getPrice() > 1000000) {
                        return true;
                    } else {
                        return false;
                    }
                }).toList();
                for (Phone phone : list
                ) {
                    phone.hienThiThongTin();

                }
            } else {
                System.out.println("thoat: ");
                return;
            }
        }
    }
}