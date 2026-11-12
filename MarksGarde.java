import java.util.Scanner;
class MarksGarde{
	public static void main(String args[]){
		  Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Marks: ");
        int Marks = input.nextInt();

		//int Marks=30;
			if((Marks>0)&&(Marks<100)){
				if((Marks>=75)&&(Marks<100)){
					System.out.println("Your Grad is : A");
				}else if((Marks<75)&&(Marks>=65)){
					System.out.println("Your Grad is : B");
				}else if((Marks<65)&&(Marks>=50)){
					System.out.println("Your Grad is : C");
				}else if((Marks<50)&&(Marks>=40)){
					System.out.println("Your Grad is : P");
				}else{
					System.out.println("Your Fail");
				}
			}else{
				System.out.println("Entire valid marks between 0 and 100");
			}
		
	}
}