package buoi1.jp2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private String rollNo;
    private String fullName;
    private String className;
    Scanner in = new Scanner(System.in);

    public Student(String rollNo, String fullName, String className) {
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.className = className;
    }

    public Student() {
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static boolean checkrollNo(String rollNoz) {
        String rollNo = "^[C]\\d{4}[A-Z]\\d{4}$";
        Pattern pattern = Pattern.compile(rollNo);
        Matcher matcher = pattern.matcher(rollNoz);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public static boolean checkclassName(String classNames) {
        String className = "^[C]\\d{4}[A-Z]{1,2}$";
        Pattern pattern = Pattern.compile(className);
        Matcher matcher = pattern.matcher(classNames);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public void nhapThongTin() {

        System.out.println("nhap thong tin");
        System.out.println("nhap fullName");
        this.fullName = in.nextLine();

        while (true) {
            System.out.println("nhap rollNo:");
            this.rollNo = in.nextLine();

            if (checkrollNo(rollNo)) {
                break;
            }
        }
        while (true) {
            System.out.println("nhap className:");
            this.className = in.nextLine();

            if (checkclassName(className)) {
                break;

            }
        }
    }

    public void hienThiThongTin() {
        String msg = String.format("%s | %s | %s",fullName, rollNo,className);
        System.out.println(msg);
    }

}

