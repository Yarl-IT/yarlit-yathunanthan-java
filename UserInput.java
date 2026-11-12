	import java.util.Scanner;
	class UserInput{
		public static void main(String args[]){
			Scanner scan =new Scanner(System.in);
			String name="";
			System.out.println("Please enter your name:");
			name=scan.nextLine();
			System.out.println("Your name is "+name);
			
			System.out.println("*************************");
			
			int marks=0;
			System.out.println("Enter your marks ");
			marks=scan.nextInt();
			System.out.println("Your marks is "+marks);
			System.out.println("Enter your Name ");
			char grade = scan.next().charAt(4);
			System.out.println("Your firdst letter is : "+grade);

		}
	}