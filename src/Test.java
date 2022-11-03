import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {





    public static void main(String[] args) {
//        List<Phone>phones=new ArrayList<>();
    Phone[] ph = new Phone[4];
    HomePhone hp = new HomePhone();
    MobilePhone mp = new MobilePhone();


//        nhap
        for (int i = 0; i < 2; i++) {
            Phone phone = new HomePhone();
            phone.nhapThongTin();
            ph[i] = phone;
        }

        for (int i = 2; i < 4; i++) {
            Phone phone = new MobilePhone();
            phone.nhapThongTin();
            ph[i] = phone;
        }

        for (int i =0; i<4;i++){
            ph[i].hienThongTin();
        }

        //xuat

//        HomePhone h = new HomePhone();
//
//        MobilePhone m = new MobilePhone();


//        Scanner in = new Scanner(System.in);
//        System.out.println("menu:\n1. Nhap thong tin:\n2. Hien thong tin:\n3. Thoat:");
//       while (true){
//           System.out.println("menu:\n1. Nhap thong tin:\n2. Hien thong tin:\n3. Thoat:");
//           int chon = Integer.parseInt(in.nextLine());
//
//           if (chon==1){
//               m.nhapThongTin();
//
//           }else if (chon==2){
//               m.hienThongTin();
//
//           }else {System.out.println("thoat");
//               return;
//           }
//       }
    }
}
