class  Two_DimensionalArrayForloop{
	public static void main(String args[]){
		/*int [][] x=new int[5][2];
		x[0][0]=10;
		x[0][1]=20;
		
		x[1][0]=30;
		x[1][1]=40;
		
		x[2][0]=50;
		x[2][1]=60;
		
		x[3][0]=70;
		x[3][1]=80;
		
		x[4][0]=90;
		x[4][1]=100;
		
		System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
		
		System.out.println(x[2][0]);
		System.out.println(x[2][1]);
		
		System.out.println(x[3][0]);
		System.out.println(x[3][1]);
		
		System.out.println(x[4][0]);
		System.out.println(x[4][1]);*/
		
		int [][] x={{10,20},{30,40},{50,60},{70,80},{90,100}};
		
		for(int y=0;y<x.length;y++){
			for(int z=0;z<=1;z++){
				System.out.println(x[y][z]);
			}
			System.out.println(" ");
		}
		
	}	
	
}