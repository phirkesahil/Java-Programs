import java.util.Scanner;
class IfElse{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		if(num %2==0){
			System.out.println("It is a even number");
		}
		else{
			System.out.println("It is a odd number");
		}
	}
}