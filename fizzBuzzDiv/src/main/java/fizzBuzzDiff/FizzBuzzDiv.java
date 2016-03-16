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

	public String printAccordingToDivisibility(int firstDiv, int secondDiv) {
		
			if(isDivisible(firstDiv)){
				return isDivisible(secondDiv) ? "FizzBuzz" : "Fizz" ;
			}
		
		return isDivisible(secondDiv) ? "Buzz" : "";
	}
}
