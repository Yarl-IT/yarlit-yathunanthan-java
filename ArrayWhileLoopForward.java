class ArrayWhileLoopForward{
	public static void main(String args[]){
		int[] x={10,20,30,40,50};
		
		int y=0;
		while(y<x.length){
			System.out.println(x[y]);
			y++;
		}
		System.out.println(" ");
		int z=0;
		while(z<=4){
			System.out.println(x[z]);
			z++;
		}
	}
}