
/* Constant Variable: Test data can be of two types, 
 * fixed or variable. If it is fixed, we can easily hard code the test data in to our test scripts. 
 * But sometimes the fixed test data is also used in so many scripts and if it gets changed then it is a huge task to update all the effected test scripts for example the URL of your test application.
 *  It remains same but once you shifted to other environment, you need to change it in all of your test scripts.
 *   We can easily place the URL in Text file or Excel file outside our test scripts but Java gives us special feature of creating Constants variables which works exactly the same as Environment and Global variable in QTP.*/
package utility;

public class Constant {
	
	public static final String URL= "http://goismvc1.metaoptionllc.com";
	public static final String Username= "ankupre1";
	public static final String Password="123456";
	

}
