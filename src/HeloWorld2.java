import java.util.Scanner;

public class HeloWorld2 {
    public static void main(String[] args) {
        // khai bao bien
        // kieu data+ ten bien =tao value
         int age=20;
         String msg  = "hello kiu kiu";
         System.out.println("tuoi ban nhap la:"+age);
         System.out.println("thong bao ban nhap la:"+msg);

         System.out.println("tuoi ban nhap la :"+age+"thong bao ban nhap la:"+msg);
         String s= String.format("tuoi ban nhap, thong bao ban nhap",age,msg);
         System.out.println(s);
    }
}