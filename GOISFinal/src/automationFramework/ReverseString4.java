package automationFramework;

public class ReverseString4 { 

public static void main(String[] args) { 

String str = "Hello Java"; 

for (int i = str.length() - 1; i >= 0; i--) { 
System.out.print(str.charAt(i)); 
} 
} 
}