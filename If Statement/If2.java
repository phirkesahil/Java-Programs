import java.util.Scanner;
class If2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Are you a paid student?");
		boolean paid=sc.nextBoolean();

		System.out.println("Are you a incubation student");
		boolean unpaid=sc.nextBoolean();

		if (paid)
		{
			System.out.println("Pay the fees then attend the class");
		}

		if(unpaid)
		{
			System.out.println("Attend the class");
		}
	}
}