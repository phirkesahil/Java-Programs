import java.util.Scanner;
public class BatteryStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter battery percentage: ");
        int battery = sc.nextInt();

        if (battery >= 80) {
            System.out.println("Battery is full.");
        } 
        else if (battery >= 50) {
            System.out.println("Battery is sufficient.");
        } 
        else if (battery >= 20) {
            System.out.println("Battery is low.");
        } 
        else {
            System.out.println("Battery is low! Plug in charger.");
        }
    }
}
