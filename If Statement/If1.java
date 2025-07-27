import java.util.Scanner ;
class If1{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);

		System.out.println("Enter your bill amount : ");
		double amt= sc.nextDouble();

		System.out.println("Having any coupon code?");
		boolean ip = sc.nextBoolean();

		if(ip)
		{
			amt-=100;
			System.out.println("Rs.100.0 off applied");
		}
		System.out.println("Amount Payable is : "+amt);
	}
}