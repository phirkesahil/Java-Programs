public class LoanApproval {
    public static void main(String[] args) {
        double salary = 30000;
        int creditScore = 750;

        if (salary >= 25000 || creditScore >= 700) {
            System.out.println("Loan Approved.");
        } else {
            System.out.println("Loan Denied.");
        }
    }
}
