
public class Vehicle {
    private String serialNumber;
    private String name;
    private String manufacturer;
    private String model;
    private int year;
    private float baseCost;

    public Vehicle(String serialNumber, String name, String manufacturer, String model, int year, float baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.baseCost = baseCost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(float baseCost) {
        this.baseCost = baseCost;
    }

    @Override
    public String toString() {
        return "Vehicle Information:\n" +
                "\tSerial Number: " + serialNumber + "\n" +
                "\tName: " + name + "\n" +
                "\tManufacturer: " + manufacturer + "\n" +
                "\tModel: " + model + "\n" +
                "\tYear: " + year + "\n" +
                "\tBase Cost: $" + baseCost;
    }
}
