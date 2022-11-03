import java.util.Scanner;

public class MobilePhone extends Phone {

    private String operatingSystem;


    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
public MobilePhone(){

}
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner in = new Scanner(System.in);
        System.out.println("nhap operatingSystem:");
        this.operatingSystem = in.nextLine();
    }
    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("operatingSystem"+operatingSystem);
    }


}