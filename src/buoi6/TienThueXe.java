package buoi6;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;
public class TienThueXe {


    private String tenkhach;
    private LocalDate ngayThue;
    private LocalDate ngayTra;
    private int soNgaythue;
    private int soTuan;
    private int soNgayle;
    private double phaiTra;
   public TienThueXe(){

   }

    public TienThueXe(String tenkhach, LocalDate ngayThue, LocalDate ngayTra,
                      int soNgaythue, int soTuan, int soNgayle, int phaiTra, Scanner in) {
        this.tenkhach = tenkhach;
        this.ngayThue = ngayThue;
        this.ngayTra = ngayTra;
        this.soNgaythue = soNgaythue;
        this.soTuan = soTuan;
        this.soNgayle = soNgayle;
        this.phaiTra = phaiTra;

    }

    final float donGiatuan=650000;
    final float donGiaNgay=100000;

    public String getTenkhach() {
        return tenkhach;
    }

    public void setTenkhach(String tenkhach) {
        this.tenkhach = tenkhach;
    }

    public LocalDate getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(LocalDate ngayThue) {
        this.ngayThue = ngayThue;
    }

    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }

    public int getSoNgaythue() {
        return soNgaythue;
    }

    public void setSoNgaythue(int soNgaythue) {
        this.soNgaythue = soNgaythue;
    }

    public int getSoTuan() {
        return soTuan;
    }

    public void setSoTuan(int soTuan) {
        this.soTuan = soTuan;
    }

    public int getSoNgayle() {
        return soNgayle;
    }

    public void setSoNgayle(int soNgayle) {
        this.soNgayle = soNgayle;
    }

    public double getPhaiTra() {
        return phaiTra;
    }

    public void setPhaiTra(int phaiTra) {
        this.phaiTra = phaiTra;
    }

    public float getDonGiatuan() {
        return donGiatuan;
    }

    public float getDonGiaNgay() {
        return donGiaNgay;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    Scanner in = new Scanner(System.in);

    public void nhapThongTin() {
        System.out.println("nhap ten khach:");
        this.tenkhach = in.nextLine();



        while (true) {
            System.out.println("nhap dd-MM-yyyy");
            try {
                this.ngayThue = LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                break;
            } catch (Exception ex) {
                System.out.println("nhap sai roi nhap lai");
            }
        }
        System.out.println("ngay thue:" + ngayThue);

        while (true) {
            System.out.println("nhap dd-MM-yyyy");
            try {

                this.ngayTra = LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                break;
            } catch (Exception ex) {
                System.out.println("nhap sai roi nhap lai:");
            }
        }
        System.out.println("ngay tra" + ngayTra);
    }
    public int tinhSoNgaythueXe(){
        Period pe = Period.between(ngayThue, ngayTra);
        return pe.getDays();
    }
    public int QuyDoiTuan(){

      return   this.soTuan=tinhSoNgaythueXe()/7;

    }
    public int quyDoiNgay(){
      return this.soNgayle=this.tinhSoNgaythueXe()%7;
    }
    public double PhaiTra(){
     return   this. phaiTra=  95*(this.QuyDoiTuan()*this.donGiatuan+this.quyDoiNgay()*this.donGiaNgay)/100;

    }
    public void hienThiThongTin(){
        System.out.println("ten khach hang: "+tenkhach);
        System.out.println("so tuan: "+QuyDoiTuan());
        System.out.println("ngay thue: "+tinhSoNgaythueXe());
        System.out.println("quy doi ngay: "+quyDoiNgay());
        System.out.println("phai tra: "+PhaiTra());
    }


}