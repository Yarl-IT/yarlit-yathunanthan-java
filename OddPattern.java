class OddPattern{
	public static void main(String args[]){
		for(int y=1;y<=5;y++){
			for(int x=1;x<=5;x++){
					if(x%2==1){
						System.out.print(x);
					}else{
						System.out.print("*");
					}
					
			}
			System.out.println();
		}
	}
}