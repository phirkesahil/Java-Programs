public class ExamEligibilityCheck {
    public static void main(String[] args) {
        boolean hasSubmittedForm = false;
        boolean hasPaidFees = true;

        if (!hasSubmittedForm || !hasPaidFees) {
            System.out.println("You are not eligible to appear for the exam.");
        } else {
            System.out.println("You are eligible to appear for the exam.");
        }
    }
}
