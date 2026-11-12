class StarPattern4{
	public static void main(String args[]){
		for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
		/*int n=5;
		for(int x=1;x<=n;x++){
			for(int y=x;y<n;y++){
				System.out.print(" ");
			}
			for(int z=1;z<=x;z++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}*/
	}
}