package automationFramework;


public class Tut1 {

	public static void main(String[] args) {
	
		//System.out.println(i);
		int var1=Inertut1.i;
		//Inertut1 tut1=new Inertut1();
		//int var1=tut1.i;
		System.out.println(var1);
		
		
	}
	
	
	static class Inertut1{
		static int i=0;
		public static int setI(int j){
			i=j;
			//System.out.println("");
			return i;
		}
	}
	static class Inertut2{
		public static int j=0;
		public void inerTutMtd1(){
			Inertut1.i=6;
		}
	}

}
