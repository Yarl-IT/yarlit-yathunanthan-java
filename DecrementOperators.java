class DecrementOperators{
	public static void main(String args[]){
		int y=15;
		y=y-5;
		System.out.println(y);
		y-=5;
		System.out.println(y);
		y--; //postdecrment
		System.out.println(y);
		--y; //predecrment
		System.out.println(y);
		
		
		System.out.println(y--);
		System.out.println(y);
		System.out.println(--y);
	}
}