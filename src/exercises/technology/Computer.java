package exercises.technology;

public class Computer {
    //has an amount of information it can store
    private double storageAmount;
    public double getStorageAmount() {
        return storageAmount;
    }
    //should be able to connect to networks
    private String homeNetwork;
    public String getHomeNetwork() {
        return homeNetwork;
    }
    //should have an operating system
    private String operatingSystem;
    public String getOperatingSystem() {
        return operatingSystem;
    }
    //should be able to tell us about its specs
    public String specsStatement() {
        "This machine has " + this.storageAmount + " gb of storage and runs on " + this.operatingSystem;
    }
    public boolean checkNetworkConnectivity() {
        if (homeNetwork != null) {
            return true;
        } else return false;
    }
    Computer(double storageAmount, String homeNetwork, String operatingSystem) {
        this.storageAmount = storageAmount;
        this.homeNetwork = homeNetwork;
        this.operatingSystem = operatingSystem;
    }
}
