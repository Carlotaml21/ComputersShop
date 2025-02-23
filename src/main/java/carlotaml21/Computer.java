package carlotaml21;

public class Computer {

    private String brand;
    private int storage;
    public String operatingSystem;
    private String cpuCharacteristics;
    private double price;

    public Computer(String brand, int storage, String operatingSystem, String cpuCharacteristics, double price) {
        this.brand = brand;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.cpuCharacteristics = cpuCharacteristics;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }


    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCpuCharacteristics() {
        return cpuCharacteristics;
    }

    public void setCpuCharacteristics(String cpuCharacteristics) {
        this.cpuCharacteristics = cpuCharacteristics;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "brand='" + brand + '\'' +
            ", storage=" + storage +
            ", operatingSystem='" + operatingSystem + '\'' +
            ", cpuCharacteristics='" + cpuCharacteristics + '\'' +
            ", price=" + price +
            '}';
    }
}

