import java.util.Scanner;

public class Student<S> {

    private
    String rollNO;
    String name;
    float diemToan;
    float diemLy;
    float diemHoa;
    float diemAnh;
    float diemVan;
    float diemTrungBinh;
    String xepLoai;

    public Student() {
        this.diemAnh = diemAnh;
        this.diemHoa = diemHoa;
        this.diemVan = diemVan;
        this.diemToan = diemToan;
        this.diemTrungBinh = diemTrungBinh;
        this.diemLy = diemLy;
        this.name = name;
        this.rollNO = rollNO;
        this.xepLoai = xepLoai;
    }


    public float getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(float diemAnh) {
        this.diemAnh = diemAnh;
    }

    public String getRollNO() {
        return rollNO;
    }

    public void setRollNO(String rollNO) {
        this.rollNO = rollNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public void nhapThongTin() {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap dia chi:");
        rollNO = String.format(in.nextLine());
        System.out.println("nhap ten:");
        name = String.format(in.nextLine());
        System.out.println("diem toan:");
        diemToan = in.nextFloat();
        System.out.println("diem ly:");
        diemLy = in.nextFloat();
        System.out.println("diem hoa:");
        diemHoa = in.nextFloat();
        System.out.println("diem anh:");
        diemAnh = in.nextFloat();
        System.out.println("diem van:");
        diemVan = in.nextFloat();

    }

    public void hienThiThongTin() {
        diemTrungBinh = (diemToan + diemLy + diemHoa + diemAnh + diemVan) / 5;
        System.out.println("diem trung binh la:" + diemTrungBinh);
        Student<String> s = new Student<String>();

        if (diemTrungBinh > 0 && diemTrungBinh < 6.4) {
            s.setXepLoai("TB");
            System.out.println(s.getXepLoai());
        } else if (diemTrungBinh > 6.5 && diemTrungBinh < 8) {
            s.setXepLoai("Kha");
            System.out.println(s.getXepLoai());
        } else {
            s.setXepLoai("Gioi");
            System.out.println(s.getXepLoai());
        }

    }


    public static void main(String[] args) {
        Student student = new Student();
        student.nhapThongTin();
        student.hienThiThongTin();
        student.getXepLoai();
    }

}
