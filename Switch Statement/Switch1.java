class Switch1{
	public static void main(String[] args) {
		switch(1);
		{
		case 1:{
			System.out.println("From case 1");
		}
		break;

		case 2:{
			System.out.println("From case 2");
			break;
		}

		default :{
			System.out.println("From Default block");
			break;
		}
		}
	}
}