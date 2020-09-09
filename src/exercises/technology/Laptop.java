package exercises.technology;

public class Laptop extends Computer{
    private boolean hasHinge = true;
    public boolean getHingedness() {
        return hasHinge;
    }
    private double screenSizeInches;
    public Laptop(double storageAmount, String homeNetwork, String operatingSystem, double screenSizeInches) {
        super(storageAmount);
        super (homeNetwork);
        super(operatingSystem);
        this.screenSizeInches = screenSizeInches;
    }
}
