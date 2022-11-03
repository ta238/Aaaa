package buoi5;

import java.util.ArrayList;

public class Test {
    ArrayList<Phone> list = new ArrayList<Phone>();

    public static void main(String[] args) {
        Phone ph = new HomePhone();

        for (int i = 0; i < 2; i++) {
            ph.nhapThongTin();
            ph.hienThiThongTin();
        }
        ph = new MobiPhone();
        for (int i = 0; i < 2; i++) {
            ph.nhapThongTin();
            ph.hienThiThongTin();
        }

        double min = ph.getPrince();
        double max = ph.getPrince();
        double n= ph.getPrince();
        for (int i = 0; i < n; i++) {
            if (ph.getPrince() <min) {
                n=max;
                max= ph.getPrince();
            }else {
                min= ph.getPrince();
            }
        }



        System.out.println("min" + min);
        System.out.println("max" + max);
    }
}