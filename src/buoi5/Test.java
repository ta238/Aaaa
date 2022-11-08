package buoi5;

import java.util.ArrayList;

public class Test {
//    ArrayList<Phone> list = new ArrayList<Phone>();

    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList();
        phones.add(new HomePhone());
        phones.add(new HomePhone());
        phones.add(new MobiPhone());
        phones.add(new MobiPhone());

        System.out.println(phones.size());

        for(int i = 0; i < phones.size(); i++){
            phones.get(i).nhapThongTin();
            phones.get(i).hienThiThongTin();
        }

        double min = phones.get(0).getPrince();
        double max = phones.get(0).getPrince();
        for(int i = 0; i < phones.size(); i++){
            if(min > phones.get(i).getPrince()) min = phones.get(i).getPrince();
            if(max < phones.get(i).getPrince()) max = phones.get(i).getPrince();
           
        }
        System.out.println("min"+min);
        System.out.println("max"+max);
//        Phone ph = new HomePhone();
//
//        for (int i = 0; i < 2; i++) {
//            ph.nhapThongTin();
//            ph.hienThiThongTin();
//        }
//        ph = new MobiPhone();
//        for (int i = 0; i < 2; i++) {
//            ph.nhapThongTin();
//            ph.hienThiThongTin();
//        }
//
//        double min = ph.getPrince();
//        double max = ph.getPrince();
//        double n= ph.getPrince();
//        for (int i = 0; i < n; i++) {
//            if (n <min) {
//                n=max;
//                max= ph.getPrince();
//            }else {
//                min= ph.getPrince();
//            }
//        }
//
//
//
//        System.out.println("min" + min);
//        System.out.println("max" + max);
    }
}