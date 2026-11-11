class ArrayForLoopReverse{
	public static void main(String args[]){
		int[] x={10,20,30,40,50};
		System.out.println(" ");
		for (int a = x.length - 1; a >= 0; a--) {
				System.out.println(x[a]);
		}
		System.out.println(" ");
		for (int a = 4; a >= 0; a--) {
				System.out.println(x[a]);
		}
	} 
}