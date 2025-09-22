import java.util.ArrayList;
public class Customer {
    private int customerId;
    private String name;
    private String address;
    //from the association
    private ArrayList<Invoice> invoices;
}