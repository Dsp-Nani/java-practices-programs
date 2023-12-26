// adding of two given numbers from user program using java program
package demo;
import java.util.Scanner;
public class addtwonumbers {

	public static void main(String args[]) 
	{
		
		Scanner scan = new Scanner(System.in);  //declaring scanner object 
		
		// declaring two variables and assign values from user input 
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		// addition operation
		int sum = a+b;
		
		//displaying output
		System.out.println(sum);
		
	}
}
