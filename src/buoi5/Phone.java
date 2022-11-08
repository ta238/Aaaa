package buoi5;

public abstract class Phone {
    private String name;
    private double prince;
    private String manufacturer;

    public abstract void nhapThongTin();

    public abstract void hienThiThongTin();

    public Phone(String name, double prince, String manufacturer) {
        this.name = name;
        this.prince = prince;
        this.manufacturer = manufacturer;
    }

    public Phone() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}


