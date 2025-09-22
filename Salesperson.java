
import java.util.ArrayList;
import java.util.List;

public class Salesperson {
    private String salespersonID;
    private String name;
    private String phoneNumber;
    private List<Invoice> invoices;

    public Salesperson(String salespersonID, String name, String phoneNumber) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.invoices = new ArrayList<>();
    }

    public String getSalespersonID() {
        return salespersonID;
    }

    public void setSalespersonID(String salespersonID) {
        this.salespersonID = salespersonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
    }
}
