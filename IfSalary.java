class IfSalary{
	public static void main (String args[]){
		int employeSalary=50000;
		int tax;
		int netsalary;
		
		
		 if(employeSalary>=100000){
			 tax=employeSalary*3/1000;
		 }else{
			 tax=employeSalary*1/1000;
		 }
		 netsalary=employeSalary-tax;
		 System.out.println("Employee Basic Salary : "+employeSalary);
		 System.out.println("Netsalary : "+netsalary);
		 System.out.println("Tax : "+tax);
		 
	}
}