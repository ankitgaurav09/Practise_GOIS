package automationFramework;

public class Swap {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		swapNum(x,y);
	}
		private static void swapNum(int x,int y){
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println("after swapping value of x is:" +x);
		}
		
}
