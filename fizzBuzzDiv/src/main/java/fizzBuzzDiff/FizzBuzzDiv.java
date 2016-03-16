package fizzBuzzDiff;

/**
 * Hello world!
 *
 */
public class FizzBuzzDiv 
{
	private int numberToCheck;
	
    public FizzBuzzDiv(int numberToCheck) {

    		this.numberToCheck = numberToCheck;
    
    }

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public boolean isDivisible(int divsor) {

		return (numberToCheck%divsor==0) ? true : false;
	}
}
