import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Is first greater than second? " + (a > b));
        System.out.println("Are both numbers equal? " + (a == b));
    }
}
