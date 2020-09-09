package exercises.technology;

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone(128, "Invisible Blimp", "Windows", 800);
        System.out.println(myPhone.checkNetworkConnectivity());
    }
}
