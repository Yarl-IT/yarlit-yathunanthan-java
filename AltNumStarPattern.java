class AltNumStarPattern{
	public static void main(String args[]){
		for(int x=1;x<=5;x++){
			if(x%2==1){
				for(int z=1;z<=5;z++){
					System.out.print(x);
				}
						
			}else{
				for(int z=1;z<=5;z++){
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}