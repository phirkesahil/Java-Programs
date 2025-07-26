public class StudentEligibility  {
    public static void main(String[] args) {
        int age = 19;
        int marks = 85;

        if (age >= 18 && marks >= 60) {
            System.out.println("Eligible for admission.");
        } else {
            System.out.println("Not eligible for admission.");
        }
    }
}
