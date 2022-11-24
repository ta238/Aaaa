package buoi2.jp2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private String rollNo;
    private String className;
    private String fullName;
    Scanner in = new Scanner(System.in);

    public Student(String rollNo, String className, String fullName) {
        this.rollNo = rollNo;
        this.className = className;
        this.fullName = fullName;
    }

    public Student() {
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void nhapThongTin() {

        System.out.println("NHAP THONH TIN");
        System.out.println("nhap fullName:");

        this.fullName = in.nextLine();
        while (true) {
            System.out.println("rollNo:");
            this.rollNo = in.nextLine();
            if (checkRollNo(rollNo)) {
                break;

            }
        }
        while (true) {
            System.out.println("nhap className:");
            this.className = in.nextLine();

            if (checkClassName(className)) {
                break;
            }
        }
    }

    public static boolean checkRollNo(String rollNo) {
        String s = "^[C]\\d{4}[A-Z]\\d{4}$";
        Pattern pattern = Pattern.compile(s);
        Matcher matcher = pattern.matcher(rollNo);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public static boolean checkClassName(String classNames) {
        String string = "^[C]\\d{4}[A-Z]{1,2}$";
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(classNames);
        if (matcher.find()) {
            return true;
        }
        return false;
    }
    public void hienThiThongTin(){
        String msg = String.format("%s | %s | %s ",fullName,rollNo,className);
        System.out.println(msg);
    }
}

