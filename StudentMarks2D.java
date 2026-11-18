import java.util.Scanner;
class StudentMarks2D{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int students=4;
		int subjects=3;
		
		String[] subjectNames={"ICT","Tamil","Maths"};
		int[][] marks=new int[students][subjects];
		
		//Input marks
		for(int j=0;j<students;j++){
			System.out.println("Enter marks for student"+(j+1));
			for(int i=0;i<subjects;i++){
				System.out.print(subjectNames[i]+":");
				marks[j][i]=sc.nextInt();
			}
			System.out.println();
			
		}
		System.out.println("Student\tICT\tTamil\tMaths\tTotal\tAverage");
		//Display
		for(int i=0;i<students;i++){
			int total=0;
			System.out.print("S"+(i+1)+"\t");
			for(int j=0;j<subjects;j++){
				System.out.print(marks[i][j]+"\t");
				total+=marks[i][j];
			}
			double avg=total/(double)subjects;
			System.out.println("total"+"\t"+avg);
		}
		
	}
}