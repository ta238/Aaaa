package buoi6;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        ArrayList<TienThueXe> arrList = new ArrayList<>();

        while (true) {
            System.out.println("1. Nhap thong tin cho danh sach Tien Thue Xe");
            System.out.println("2. Hien thị thông tin danh sach Tien Thue Xe");
            System.out.println("3. HIển thị TỔNG CỘNG từ danh sách Ket Tien Thue Xe");
            System.out.println("4. Tìm và hiển thị Khách Hàng phải trả nhiều tiền nhất");
            System.out.println("5. Tìm và hiển thị Khách Hàng phải trả ít tiền nhất");
            System.out.println("6. Thoat");
            int chon = Integer.parseInt(in.nextLine());
            switch (chon) {
                case 1:

//                    for (TienThueXe a : arrList) {
//                        TienThueXe tienThueXen = new TienThueXe();
//                        tienThueXen.nhapThongTin();
//                        a = tienThueXen;
//
//                    }
                    for (int i = 0; i < 3; i++) {
                        TienThueXe tienThueXen = new TienThueXe();
                        tienThueXen.nhapThongTin();
                       arrList.add(tienThueXen);

                    }
                    break;
                case 2:
                    for (TienThueXe a : arrList) {
                        a.hienThiThongTin();

                    }
                    break;
                case 3:
                    double sumSoNgayThueXe = 0;
                    double sumSoTuanThue = 0;
                    double sumSoNgayLeThue = 0;
                    double sumTienPhaiTra = 0;

                    for (TienThueXe a : arrList) {
                        sumSoNgayThueXe += a.tinhSoNgaythueXe();
                        sumSoTuanThue += a.QuyDoiTuan();
                        sumTienPhaiTra += a.PhaiTra();
                        sumSoNgayLeThue += a.quyDoiNgay();
                    }
                    System.out.println("so ngay thue xe: " + sumSoNgayLeThue + "so tuan thue: "
                            + sumSoTuanThue + "so ngay le thue: " + sumSoNgayLeThue + "so tien phai tra: " + sumTienPhaiTra);
                    break;
                case 4:
                    TienThueXe t = arrList.get(0);
                    for (TienThueXe a : arrList) {
                        if (t.PhaiTra() < a.PhaiTra()) {
                            t = a;

                        }
                    }
                    t.hienThiThongTin();
                    break;
                case 5:
                    TienThueXe d = arrList.get(0);
                    for (TienThueXe a : arrList) {
                        if (d.PhaiTra() > a.PhaiTra()) {
                            d = a;

                        }
                    }
                    d.hienThiThongTin();
                    break;
                case 6:
                    System.exit(0);

            }

        }

        }

    }


