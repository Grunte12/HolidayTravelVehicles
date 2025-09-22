import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {
    private String invoiceID;
    private Date date;
    private double finalPrice;
    private double tradeInAllowance;
    private double taxes;
    private double licenseFee;
    private String customerSignature;
    private Vehicle vehicle;
    private TradeIn tradeIn;
    private List<DealerOption> dealerOptions;

    public Invoice(String invoiceID, Date date, String customerSignature, Vehicle vehicle) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.customerSignature = customerSignature;
        this.vehicle = vehicle;
        this.dealerOptions = new ArrayList<>();
        calculateFinalPrice();
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public double getTradeInAllowance() {
        return tradeInAllowance;
    }

    public void setTradeInAllowance(double tradeInAllowance) {
        this.tradeInAllowance = tradeInAllowance;
        calculateFinalPrice();
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
        calculateFinalPrice();
    }

    public double getLicenseFee() {
        return licenseFee;
    }

    public void setLicenseFee(double licenseFee) {
        this.licenseFee = licenseFee;
        calculateFinalPrice();
    }

    public String getCustomerSignature() {
        return customerSignature;
    }

    public void setCustomerSignature(String customerSignature) {
        this.customerSignature = customerSignature;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        calculateFinalPrice();
    }

    public TradeIn getTradeIn() {
        return tradeIn;
    }

    public void setTradeIn(TradeIn tradeIn) {
        this.tradeIn = tradeIn;
    }

    public List<DealerOption> getDealerOptions() {
        return dealerOptions;
    }

    public void addDealerOption(DealerOption dealerOption) {
        this.dealerOptions.add(dealerOption);
        calculateFinalPrice();
    }

    private void calculateFinalPrice() {
        double baseCost = this.vehicle.getBaseCost();
        double optionsPrice = dealerOptions.stream().mapToDouble(DealerOption::getPrice).sum();
        double tradeInValue = this.tradeInAllowance;
        double taxValue = this.taxes;
        double licenseValue = this.licenseFee;

        this.finalPrice = baseCost + optionsPrice - tradeInValue + taxValue + licenseValue;
    }
}
