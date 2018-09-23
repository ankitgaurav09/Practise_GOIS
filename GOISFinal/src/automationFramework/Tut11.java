package automationFramework;




public class Tut11 {

	public static void main(String[] args) {
	
		//System.out.println(i);
		int var1=Inertut11.i;
		int var2=Inertut12.i;
		//Inertut1 tut1=new Inertut1();
		//int var1=tut1.i;
		System.out.println(var1);
		System.out.println(var2);
		
		
	}
	
}
	
	
	/* static class Inertut11{
		static int i=9;
		public static int setI(int j){
			i=j;
			//System.out.println("");
			return i;
		}
	} */

/* static class */
class Inertut11{
	static int i=9;
	public static int setI(int j){
		i=j;
		//System.out.println("");
		return i;
	}
}
	class Inertut12{
		public static int i=55;
		public static int j=10;
		public int inerTutMtd1(){
			Inertut11.i=16;
			return i;
		}
	}


