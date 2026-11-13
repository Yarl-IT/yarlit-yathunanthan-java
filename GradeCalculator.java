import java.util.Scanner;
class GradeCalculator{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int marks[]=new int[3];
		int total=0;
		int average=0;
		 for(int x=0;x<marks.length;x++){
			 System.out.print("Enter marks for subject"+(x+1)+":");
			 marks[x]=scan.nextInt();
			 total=total+marks[x];
		 }
		 System.out.println(" ");
		 
		 average=total/marks.length;
		 
		 if((average<=100)&&(average>=75)){
			 System.out.println("Grade A");
		 }else if((average<75)&&(65<=average)){
			 System.out.println("Grade B");
		 }else if((average<65)&&(55<=average)){
			 System.out.println("Grade C");
		 }else if((average<55)&&(average>=45)){
			 System.out.println("Grade P");
		 }else if((average<45)&&(average>=00)){
			 System.out.println("Grade F");
		 }else{
			 System.out.print("Invalid marks");
		 }
		 
	}	
}