class InvertedNumbersPyrramid{
	public static void main(String args[]){
		for(int x=5;x>=1;x--){
			for(int y=5;y>=x;y--){
				System.out.print(" ");
			}
			for(int z=1;z<=x;z++){
				System.out.print(z+"");
			}
			System.out.println();
		}
	}
}