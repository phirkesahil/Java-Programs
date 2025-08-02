import java.util.Scanner;

class DoWhileLoop4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int secret = 7;
        int guess;

        do {
            System.out.print("Guess the number (1-10): ");
            guess = sc.nextInt();

            if (guess != secret) {
                System.out.println("Wrong! Try again.");
            }
        } 
        while (guess != secret);

        System.out.println("Correct! You guessed it.");
    }
}