package Session8;
class TwoWheeler implements IVehicle, {
    String ID; // variable to store vehicle ID
    String type; // variable to store vehicle type
    /**
     * Parameterized constructor to initialize values based on user input
     * 
     * @param ID a String variable storing vehicle ID
     * @param type a String variable storing vehicle type
     */
    public TwoWheeler(String ID, String type) {
        this.ID = ID;
        this.type = type;
    }
    /**
     * Overridden method, Starts a vehicle
     * 
     * @return void
     */
    @Override
    public void start() {
        System.out.println("Starting the " + type + "...");
    }
    /**
     * Overridden method, accelerates a vehicle
     * @param speed an integer storing the speed
     * @return void
     */
    @Override
    public void accelerate(int speed) {
        System.out.println("Accelerating at speed " + speed + " km/h...");
    }
    /**
     * Overridden method, applies brakes to a vehicle
     * @return void     
     */
    @Override
    public void brake() {
        System.out.println("Applying brakes ");
    }
    /**
     * Overridden method, stops a vehicle
     * 
     * @return void
     */
    @Override
    public void stop() {
        System.out.println("Stopping the " + type + "...");
    }
    /**
     * Displays vehicle details
     * 
     * @return void
     */
    public void displayDetails() {
        System.out.println("Vehicle No. :" + STATEID + "" + ID);
        System.out.println("Vehicle Type: " + type);
    }
    // Implementing the IManufacturer interface methods
    /**
     * Overriden method, adds manufacturer details
     * @param detail a string variable storing manufacturer details
     * @return void
     */
    @Override
    public void addContact(String detail) {
        System.out.println("Manufacturer: " + detail);
}
/**
 * Overriden method, calls the manufacturer
 * @param phone a String variable storing phone number
 * @return void
 */
    @Override
    public void callManufacturer(String phone) {
        System.out.println("Calling manufacturer at: " + phone);
    }
    /**
     * Overriden method, makes payment 
     * @param amount a string variable storing amount
     * @return void
     */
    @Override
    public void makePayment(float amount) {
        System.out.println("Payable amount: $" + amount);
    }
}
/**
 * Define the class TestVehicle.java
 */
public class TestVehicle {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Verify number of command line arguments
        if (args.length == 6) {
            // Instantiate the  class
            TwoWheeler objBike = new TwoWheeler(args[0], args[1]);
            objBike.displayDetails(); // display vehicle details
            objBike.start(); // start the vehicle
            objBike.accelerate(Integer.parseInt(args[2])); // accelerate the vehicle
            objBike.brake(); // apply brakes
            objBike.stop(); // stop the vehicle
            objBike.addContact(args[3]); // add manufacturer details
            objBike.callManufacturer(args[4]); // call the manufacturer
            objBike.makePayment(Float.parseFloat(args[5])); // make payment
        }
        else {
            // display error message
            System.out.println("Usage: java TestVehicle <ID> <Type> <Speed> <Manufacturer> <Phone> <Amount>");
        }
    }
}
