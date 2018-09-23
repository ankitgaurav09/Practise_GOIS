package automationFramework;

public class ReverseString2 {

	public static void main(String[] args) {
		
		      String string = "abcdef";
		      StringBuffer sb1=new StringBuffer(string);
		      String sb2=sb1.reverse().toString();
		      //String reverse = new StringBuffer(string).reverse().toString();
		      System.out.println("\nString before reverse: "+string);
		      //System.out.println("String after reverse: "+reverse);
		      System.out.println(sb2);
		   }

	

}
