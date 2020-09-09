package exercises.technology;

public class Computer extends AbstractEntity{
    //brings in ID from AbstractEntity
    double ID = nextId;

    //stores things in binary
    private String basicLanguage = "binary";
    public String getBasicLanguage() {
        return basicLanguage;
    }

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
        return "This machine has " + this.storageAmount + " gb of storage and runs on " + this.operatingSystem;
    }
    public boolean checkNetworkConnectivity() {
        if (homeNetwork != null) {
            return true;
        } else return false;
    }
    public Computer(double storageAmount, String homeNetwork, String operatingSystem) {
        this.storageAmount = storageAmount;
        this.homeNetwork = homeNetwork;
        this.operatingSystem = operatingSystem;
    }
}
