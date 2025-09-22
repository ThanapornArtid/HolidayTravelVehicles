public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(112233, "Mu Tesla", "Muve", 2025,"Tesla", 125490);
  
        
        System.out.println("Vehicle Serial Number: " + v.getSerialNumber());
        System.out.println("Vehicle Name: " + v.getName());
        System.out.println("Vehicle Model: " + v.getModel());
        System.out.println("Vehicle Year: " + v.getYear());
        System.out.println("Vehicle Manufacturer: " + v.getManufacturer());
        System.out.println("Vehicle Base Cost: " + v.getBaseCost());
    }
}