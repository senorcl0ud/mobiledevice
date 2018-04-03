package mobile_device;



public class MobileDevice {
    private String manufacturer;
    private String device;
    protected String operatingSystem;
    private double cost;


    public MobileDevice(){

    }

    public MobileDevice(String manufacturer, String deviceName, String os, double cost){
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.device = deviceName;
        this.operatingSystem = os;
    }

    @Override
    public String toString(){
        return "Device name: " + device + "\n" + "Manufacturer: " + manufacturer +
                "\n" + "Operating System" + operatingSystem + "\n" + "Cost: " + cost + "\n";
    }

    public String calculateDiscount(double discount){
        return  "\nThe price of this device is " +  cost * (discount/100) + " USD. \n";
    }

    public String listMyApps(){
        return "All mobile devices run apps.";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String opertatingSystem) {
        this.operatingSystem = opertatingSystem;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }



}
