import java.util.Scanner;
class StudentMarksArray{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int[] x= new int[5];
		int total=0;
		
		for(int y=0;y<x.length;y++){
			System.out.println("Enter Marks"+y+":");
			x[y]=scan.nextInt();
			total=total+x[y];
			
		}
		
		System.out.println("Your Total is : "+total);
		System.out.println("Your Average  is : "+total/x.length);
	}
}