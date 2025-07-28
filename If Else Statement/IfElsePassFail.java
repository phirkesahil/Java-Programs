import java.util.Scanner;
class IfElsePassFail
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

		System.out.println("Enter Your Marks: ");
		int marks = sc.nextInt();

		if(marks>=40){
			System.out.println("You Passed!");
		}
		else{
			System.out.println("You Fail");
		}
	}
}