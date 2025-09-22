
public class DealerOption {
    private int optionCode;
    private String description;
    private double  price;

    public DealerOption(int optionCode, String description, double  price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }

    public int getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(int optionCode) {
        this.optionCode = optionCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
