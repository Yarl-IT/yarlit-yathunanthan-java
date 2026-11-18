class NumberPyramid{
	public static void main(String args[]){
		int n=5;
		for(int x=1;x<=n;x++){
			for(int y=x;y<n;y++){
				System.out.print(" ");
			}
			for(int z=1;z<=x;z++){
				System.out.print(z+"");
			}
			System.out.println();
		}
	}
}