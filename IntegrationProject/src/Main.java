// Jaisson Lazo
// A combination of everything I've learned
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to my program!");
		//boolean - a binary datatype with only 2 possible values, true and false, it uses 1 bit of memory
	    //byte - A byte is one of the ways to store integer numbers in java, it uses 1 byte of memory
        //char - A char is a way to store a single character in java, useful when storing simple characteristics like gender
        //short - A short is one of the ways to store integer numbers in java, but it uses 2 bytes of memory
        //int - A int is one of the ways to store integer numbers in java, but it uses 4 bytes of memory
		//long - A long is one of the ways to store integer numbers in java, but it uses 8 bytes of memory
		//float - A float is one of the ways to store decimal numbers in java, it uses 4 bytes of memory
		//double - A double is one of the ways to store decimal numbers in java, it uses 8 bytes of memory
		boolean b = true;
		int i = 4; 
		double d = 5.0;
		String s = "Goodbye"; 
		// Variables are the way for programmers to store data in the form of the datatypes.
		// Scopes define the space in which the variable exists.
		final int j = 6; 
		//The final keyword means that the variable's value cannot be changed later on in the program.
		int len = s.length();
		//length outputs how many characters a string has.
		String k = "Hello";
		int n = s.compareTo(k);
		//compareTo compares two strings lexicographically
		System.out.println(s.equals(k));
		//equals declares whether or not two strings have the same contents (true or false).
		System.out.println("\"word\"");
		double result = (double) 5/2; 
		double n1 = squareRoot(4); //calling method squareRoot
		// 4 is an argument 
		// header is squareRoot
		Random num = new Random(); 
		int randomnum = num.nextInt(20)+1;
		System.out.println("Random Number: " + randomnum);
		String answer = false ? "Dude, that was true" : "Sorry Dude, it's false";
		int myInt = 30;
		
		if (myInt < 10) {
			System.out.println("Yes, it's true!");
		}
		else if(myInt > 20) {
			System.out.println("No, it's false!"); 
			int month = 4;
	        String monthString;
	        switch (month) {
	            case 1:  monthString = "January";
	                     break;
	            case 2:  monthString = "February";
	                     break;
	            case 3:  monthString = "March";
	                     break;
	            case 4:  monthString = "April";
	                     break;
	            case 5:  monthString = "May";
	                     break;
	            case 6:  monthString = "June";
	                     break;
	            case 7:  monthString = "July";
	                     break;
	            case 8:  monthString = "August";
	                     break;
	            case 9:  monthString = "September";
	                     break;
	            case 10: monthString = "October";
	                     break;
	            case 11: monthString = "November";
	                     break;
	            case 12: monthString = "December";
	                     break;
	            default: monthString = "Invalid month";
	                     break;
	        }
	        System.out.println(monthString);
		}
		int result1 = 1 + 2;
        System.out.println("1 + 2 = " + result1);
        int original_result = result1;

        result1 = result1 - 1;
        System.out.println(original_result + " - 1 = " + result1);
        original_result = result1;

        result1 = result1 * 2;
        System.out.println(original_result + " * 2 = " + result1);
        original_result = result1;

        result1 = result1 / 2;
        System.out.println(original_result + " / 2 = " + result1);
        original_result = result1;

        result1 = result1 + 8;
        System.out.println(original_result + " + 8 = " + result1);
        original_result = result1;

        result1 = result1 % 7;
        System.out.println(original_result + " % 7 = " + result1);
        
        int a1 = 2;
        int b1 = 1;
        if (a1 > b1)
            System.out.println("a1 > b1");
       
        double x = 0;
        x += 1.1;
        System.out.println(x);
        
        x++;
        System.out.println(x);
        
        x--;
        System.out.println(x);
        
        if((b1 == 1) && (a1 == 2))
            System.out.println("b1 is 1 AND a1 is 2");
        
         int prec = 12 - 4 * 2; //operator precedence is the order in which the operators in an expression are evaluated when the expression has several operators.
         //Above, the line first processes 4 * 2 because the multiplicative operator appears before the additive operator in precedence order.
         System.out.println(prec);
	}
				
	private static double squareRoot(double n1) {
		return Math.sqrt(n1);
		//n1 is a parameter
		//new cooment
	}

}