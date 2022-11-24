package buoi9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<TienNuoc> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int leghtTienNoc;
        System.out.println("nhap leghtTienNuoc");
        leghtTienNoc = in.nextInt();
        for (int i = 0; i < leghtTienNoc; i++) {
            TienNuoc t1 = new TienNuoc();
            System.out.println("NHAP THONG TIN ");
            t1.nhapThongTin();
            t1.tinhTienNuoc();
            t1.tinhPhuPhi();
            t1.tinhTieuThu();
            t1.tinhPhaiTra();
            list.add(t1);
        }
        for (TienNuoc tienNuoc : list) {
            System.out.println("HIEN THI THONG TIN ");
            tienNuoc.hienThiThongtin();
        }

        double sumTieuThu = 0;
        double sumtienNuoc = 0;
        double sumPhuPhi = 0;
        double sumPhaiTra = 0;
        for (TienNuoc tienNuoc : list) {
            sumPhaiTra += tienNuoc.tinhPhaiTra();
            sumTieuThu += tienNuoc.tinhTieuThu();
            sumtienNuoc += tienNuoc.tinhTienNuoc();
            sumPhuPhi += tienNuoc.tinhPhuPhi();

        }
        System.out.println("===TONG===" + sumTieuThu + "|" + sumtienNuoc + "|" + sumPhuPhi + "|" + sumPhaiTra + "|");
        TienNuoc khTraNhieuNhat = list.stream().max((o1, o2) -> {
            if (o1.tinhTienNuoc() < o2.tinhTienNuoc()) {
                return -1;
            } else if(o1.tinhTienNuoc() == o2.tinhTienNuoc()) {
                return 0;
            } else {
                return 1;
            }
        }).get();
    }

}

