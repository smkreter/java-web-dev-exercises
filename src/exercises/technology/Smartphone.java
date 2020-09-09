package exercises.technology;

public class Smartphone extends Computer{
    private boolean hasHinge = false;
    public boolean getHingedness() {
        return hasHinge;
    }
    private double screenSizePixels;
    public Smartphone(double storageAmount, String homeNetwork, String operatingSystem, double screenSizePixels) {
        super(storageAmount);
        super (homeNetwork);
        super(operatingSystem);
        this.screenSizePixels = screenSizePixels;
    }
}
