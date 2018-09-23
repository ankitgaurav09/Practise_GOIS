package automationFramework;

public class Overriding {

		void run(){System.out.println("Vehicle is running");}  
		}  
		class Bike2 extends Overriding{  
		void run(){System.out.println("Bike is running safely");}  
		  
		public static void main(String args[]){  
		Bike2 obj = new Bike2();  
		obj.run();  
		}  

	}


