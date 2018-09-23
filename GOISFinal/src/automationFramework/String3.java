package automationFramework;

public class String3 {

	public static void main(String[] args) {
		
		String str1= "MY NAME IS ANKIT";
		
		String arr[]=str1.split(" ");
		
		for(int i=0;i<arr.length;i++)
	      {

	          for(int j=arr[i].length()-1;j>=0;j--)
	          {   
	          System.out.print(arr[i].charAt(j));
	          }
	          System.out.print(" ");
	      }
	}

}
