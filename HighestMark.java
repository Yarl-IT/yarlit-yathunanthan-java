class HighestMark{
	public static void main(String args []){
		int[] marks={10,20,30,40,50,60,70,80,90};
		int max=marks[0];
		for(int x=0;x<marks.length;x++){
			if(max<marks[x]){
				max=marks[x];
			}
		}
		System.out.println(" HighestMark:"+max);
	}
}