import java.util.Scanner;
class SwitchVowels{
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a single alphabet");
	char ch=sc.next().charAt(0);

	if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z')

		switch(ch)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
		System.out.println("It is a Vowel");
		break;
	
default:
	System.out.println("It is a Consonent");
}
}
}
