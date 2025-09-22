import java.util.ArrayList;
public class Invoice {
    private String customerInformation;
    private String tradeInVehicleInformation;
    private String tradeInAllowance;
    private String purchaseVehicleInformation;
    private String dealerInstallOptionRequest;
    private String customerSignature;
    private int finalNegotiatedPrice;
    private int applicableTaxes;
    private int licenseFee;
    //from the association
    private Customer customer;
    private Saleperson saleperson;
    private TradeInVehicle tradeInVehicle;
    private Vehicle vehicle;
    private ArrayList<DealerInstallOption> dealerInstallOptions;
}