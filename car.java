public class car{
	public static void main(String[] args){
		move(30);
		System.out.println(speedUp(10,20));
	    System.out.println(speedDown(40,20));
	}
	
	public static void move(int num){
		System.out.println("ÒÆ¶¯numÃ×="+num);
	}
	public static int speedUp(int x,int y){
		int result =x+y;
		return result;
	}
	public static int speedDown(int i,int j){
		int resduce=i-j;
		return resduce;
	}
}