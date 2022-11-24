package buoi2.jp2;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        int chon = Integer.parseInt(in.nextLine());
        while (true) {
            System.out.println("1. Nhap thong tin cho mang Student");
            System.out.println("2. Hien thong tin danh sach Student");
            System.out.println("3. Hiển thị danh sách Student group by className");
            System.out.println("4. Hiển thị danh sách Student theo tên className được nhập từ keyboard");
            System.out.println("5. Sort list Student theo fullName hay className");
            System.out.println("6. Thoat");
            if (chon==1){
                for (Student st:list) {
                    st.nhapThongTin();
                }
            } else if (chon==2) {
                for (Student st:list){
                    st.hienThiThongTin();
                }
            } else if (chon==3) {
                Map<String,List<Student>> map = new HashMap<>();
                  list=new ArrayList<>();
               map.put("1",list);
            } else if (chon==4) {

            } else if (chon==5) {
                Collections.sort(list,(a,b)->a.getFullName().compareTo(b.getClassName()));
                list.forEach(System.out::println);
            }else {
                System.out.println("thoat");
            }
        }
    }
}
