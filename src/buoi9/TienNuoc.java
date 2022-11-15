package buoi9;

import java.util.Scanner;

public class TienNuoc {
    private String chuHo;
    private int soCu;
    private int soMoi;
    private int tieuThu;
    private int tienNuoc;
    private int phuNuoc;
    private double phaiTra;

    public TienNuoc(String chuHo, int soCu, int soMoi, int tieuThu, int tienNuoc, int phuNuoc, double phaiTra) {
        this.chuHo = chuHo;
        this.soCu = soCu;
        this.soMoi = soMoi;
        this.tieuThu = tieuThu;
        this.tienNuoc = tienNuoc;
        this.phuNuoc = phuNuoc;
        this.phaiTra = phaiTra;
    }

    public TienNuoc() {
    }

    public String getChuHo() {
        return chuHo;
    }

    public void setChuHo(String chuHo) {
        this.chuHo = chuHo;
    }

    public int getSoCu() {
        return soCu;
    }

    public void setSoCu(int soCu) {
        this.soCu = soCu;
    }

    public int getSoMoi() {
        return soMoi;
    }

    public void setSoMoi(int soMoi) {
        this.soMoi = soMoi;
    }

    public int getTieuThu() {
        return tieuThu;
    }

    public void setTieuThu(int tieuThu) {
        this.tieuThu = tieuThu;
    }

    public int getTienNuoc() {
        return tienNuoc;
    }

    public void setTienNuoc(int tienNuoc) {
        this.tienNuoc = tienNuoc;
    }

    public int getPhuNuoc() {
        return phuNuoc;
    }

    public void setPhuNuoc(int phuNuoc) {
        this.phuNuoc = phuNuoc;
    }

    public double getPhaiTra() {
        return phaiTra;
    }

    public void setPhaiTra(double phaiTra) {
        this.phaiTra = phaiTra;
    }

    public void nhapThongTin() {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap ten chu ho: ");
        this.chuHo = in.nextLine();
        System.out.println("so cu :");
        this.soCu = in.nextInt();
        System.out.println("so moi: ");
        this.soMoi = in.nextInt();
    }

    public int tinhTieuThu() {
        return this.tieuThu = this.soMoi - this.soCu;
    }

    public int tinhTienNuoc() {
        if (tinhTieuThu() < 50) {
            this.tienNuoc = tinhTieuThu() * 100;
        } else if (tinhTieuThu() > 50) {
            this.tienNuoc = tinhTieuThu() * 150;
        } else {
            this.tienNuoc = tinhTieuThu() * 200;
        }
        return tienNuoc;
    }

    public int tinhPhuPhi() {
        if (tinhTieuThu() < 50) {
            this.phuNuoc = tinhTienNuoc() * 2 / 100;
        } else if (tinhTieuThu() > 50) {
            this.phuNuoc = tinhTienNuoc() * 3 / 100;
        } else {
            this.phuNuoc = tinhTienNuoc() * 3 / 100;
        }
        return phuNuoc;
    }

    public double tinhPhaiTra() {
        return this.phaiTra = tinhTienNuoc() + tinhPhuPhi();
    }

    public void hienThiThongtin() {

    String msg=String.format("| %s | %s | %s | %s | %s | %s | %s |", chuHo, soCu, soMoi, tinhTieuThu(), tinhTienNuoc()
                , tinhPhuPhi(), tinhPhaiTra());
System.out.println(msg);
    }
}

