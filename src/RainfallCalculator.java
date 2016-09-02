import java.util.Scanner;

public class RainfallCalculator {

	public static void main( String[] args ) 
	  { 
	    Scanner keyboard = new Scanner(System.in);

	    double num1, num2, num3;

	    System.out.print( "Enter height of roof in feet  " );
	    num1 = 12 * keyboard.nextDouble();

	    System.out.print( "Enter length of roof in feet  " );
	    num2 = 12 * keyboard.nextDouble();
	    
	    System.out.print( "Enter cubic inches of rainfall  " );
	    num3 = keyboard.nextDouble();

	    System.out.printf("The number of gallons that runs of the roof is %.02f", (num1*num2*num3)/231);
	  }
	
	
}
