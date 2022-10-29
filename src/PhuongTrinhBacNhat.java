import java.util.Scanner;

public class PhuongTrinhBacNhat {
    private
    int a;
    int b;
    int result;

    public void phuongTrinhBacNhat(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    void setA(int a) {
        this.a = a;
    }

    int getA() {
        return a;
    }

    void setResult(int result) {
        this.result = result;
    }

    int getResult() {
        return result;
    }


    int getB() {
        return b;
    }

    void setB(int b) {
        this.b = b;
    }

    void nhapThongTin() {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap a=");
        a = Integer.parseInt(in.nextLine());
        System.out.println("nhap b=");
        b = Integer.parseInt(in.nextLine());

    }

    void hienThiThongTin() {
        result = -b / a;
        System.out.println("phuong trinh bac nhat co dang " + a + "x+" + b + "=0" + "\nresult=" + result);

    }
}

