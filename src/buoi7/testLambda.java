package buoi7;

public class testLambda {

    public static void main(String[] args) {
        Laptop laptop = ngonNgu -> System.out.println("HAHAHAHAHA" + ngonNgu);
        laptop.lapTrinh("JAVA");
    }
}
