import java.util.Scanner;
class StudyPlan{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("-------------WELCOME-------------");
		System.out.println();
		System.out.println("1.Monday");
		System.out.println("2.Tuesday");
		System.out.println("3.Wednesday");
		System.out.println("4.Thursday");
		System.out.println("5.Friday");
		System.out.println("6.Saturday");
		System.out.println("7.Sunday");
		System.out.print("Enter a day number (1 to 7): ");
		int ip =sc.nextInt();

		switch(ip)
		{
		case 1:
			System.out.println("Mathematics");
			break;
		case 2:
			System.out.println("English");
			break;
		case 3:
			System.out.println("Science");
			break;
		case 4:
			System.out.println("Scoial Science");
			break;
		case 5:
			System.out.println("Marathi");
			break;
		case 6:
			System.out.println("Samskrutam");
			break;
		case 7:
			System.out.println("Chillax");
			break;
		default:
			System.out.println("There are only 7 days in a week");
		}
	}
}