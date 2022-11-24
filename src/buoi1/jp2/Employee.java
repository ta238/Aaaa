package buoi1.jp2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private String id;
    private String fullName;
    private String honeNo;

    public Employee(String id, String fullName, String honeNo) {
        this.id = id;
        this.fullName = fullName;
        this.honeNo = honeNo;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHoneNo() {
        return honeNo;
    }

    public void setHoneNo(String honeNo) {
        this.honeNo = honeNo;
    }

    public static boolean checkId(String id) {
        String ids = "^[EMP]//d{4}$";
        Pattern pattern = Pattern.compile(ids);
        Matcher matcher = pattern.matcher(id);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public static boolean checkPhoneNo(String phones) {
        String phone = "^//d{3}/s//d{9}$";
        Pattern pattern = Pattern.compile(phone);
        Matcher matcher = pattern.matcher(phones);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    Scanner in = new Scanner(System.in);

    public void nhapThongTin() {
        System.out.println("NHAP THONG TIN:");
        System.out.println("nhap fullName");
        this.fullName = in.nextLine();
        while (true) {
            System.out.println("nhap id");
            this.id = in.nextLine();
            if (checkId(id)) {
                break;
            }
        }
        while (true) {
            System.out.println("nhap phoneNo");
            this.honeNo = in.nextLine();
            if (checkPhoneNo(honeNo)) {
                break;
            }
        }
    }
    public void hienThiThongTin(){
        String msg = String.format("%s | %s | %s |",id,fullName,honeNo);
        System.out.println(msg);
    }
}
