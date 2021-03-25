import java.math.BigDecimal;

public class Rational {
	// Q1: Define the Rational class, numerator and denominator should be long type.
    private long numerator;
    private long denominator;

    // Q2: Define a constructor without arguments and set numerator as 1, denominator as 10.
    public Rational() {
        numerator = 1;
        denominator = 10;
    }
    
    // Q6: Define a constructor takes two arguments and uses them to iniaialise the object.
    public Rational(long numerator, long denominator) {
    	this.numerator = numerator;
    	this.denominator = denominator;
    }
    
    // Q3: PrintRational method without arguments. When denominator is not 0, output the expression as "numerator/denominator", otherwise, throw arithmetic exception and the remind message.
    public void printRational() {
    	double nu = numerator;
    	double de = denominator;
    	double result = nu / de;
        if(denominator != 0) {
        	System.out.printf("%d/%d=%.9f", numerator, denominator, result);
        	System.out.println();
        }
        else{
            throw new ArithmeticException("The denominator cannot be 0.");
        }    
    }
    
    // Q4: Setters for member variables.
    public void setNumerator(long numerator) {
    	this.numerator = numerator;
    }
    
    public void setDenominator(long denominator) {
    	this.denominator = denominator;
    }
    
    // Q7: Negate the sign of rational number.
    public void negateRational() {
    	numerator = 0 - numerator;
    }
    
    // Q8: Swap the numerator and denominator.
    public void swapNumeratorAndDenominator() {
    	long temp = numerator;
    	numerator = denominator;
    	denominator = temp;
    }
    
    // Q9: toDouble method to modify.
    public double toDouble() {
    	BigDecimal n1 = new BigDecimal(String.valueOf(numerator));
    	double n2 = n1.doubleValue();
    	BigDecimal d1 = new BigDecimal(String.valueOf(denominator));
    	double d2 = d1.doubleValue();
    	return n2 / d2;
    }
    
    // Q10: Method to reduce.
    public Rational reduce() {
    	Rational result = new Rational(0, 0);
    	long p = numerator;
    	long q = denominator;
    	while(p % q != 0) {
			long temp = p % q;
			p = q;
			q = temp;
		}
    	result.numerator = numerator / q;
    	result.denominator = denominator / q;
    	return result;
    }
    
    // Q11: Add method.
    public Rational add(Rational object) {
    	Rational result = new Rational(0, 0);
    	result.numerator = numerator * object.denominator + object.numerator * denominator;
    	result.denominator = denominator * object.denominator;
    	return result;
    }
    
    // Q12: Multiply method.
    public double multiply(Rational object) {
    	double newNum = numerator * object.numerator;
    	double newDen = denominator * object.denominator;
    	return newNum / newDen;
    }
    
    // Q13: Divide method.
    public Rational divide(Rational object) {
    	Rational result = new Rational(0, 0);
    	result.numerator = numerator * object.denominator;
    	result.denominator = denominator * object.numerator;
    	return result;
    }
    
    // Main method.
    public static void main(String[] args) {
    	// Q5: Create a new object of type Rational, set numerator as 1 denominator as 10, then use printRational method.
    	Rational rational1 = new Rational();
    	rational1.setNumerator(1);
    	rational1.setDenominator(10);
    	rational1.printRational();
    	
    	// Q5: Create a new object of type Rational, set numerator as 10 denominator as 0, then use printRational method. An exception comes out which means denominator cannot be 0.
//    	Rational rational2 = new Rational();
//    	rational2.setNumerator(10);
//    	rational2.setDenominator(0);
//    	rational2.printRational();
    	
    	// Q7: Test the negateRational() method in main method.
    	Rational rational3 = new Rational();
    	rational3.negateRational();
    	rational3.printRational();
    	
    	// Q8: Test the swapNumeratorAndDenominator() method in main method.
    	Rational rational4 = new Rational();
    	rational4.swapNumeratorAndDenominator();
    	rational4.printRational();
    	
    	// Q9: Test the toDouble() method in main method.
    	Rational rational5 = new Rational(9, 4);
    	double r5 = rational5.toDouble();
    	System.out.println(r5);
    	
    	// Q10: Test the reduce() method in main method.
    	Rational rational6 = new Rational(64, 40);
    	rational6.printRational();
    	Rational reduceResult = rational6.reduce();
    	reduceResult.printRational();
    	
    	// Q11: Test the add(Rational object) method in main method.
    	Rational rational7 = new Rational(64, 40);
    	Rational rational8 = new Rational(1, 10);
    	Rational addResult = rational7.add(rational8);
    	addResult.printRational();
    	
    	// Q12: Test the multiply(Rational object) method in main method.
    	Rational rational9 = new Rational(64, 40);
    	Rational rational10 = new Rational(1, 10);
    	double multiplyResult = rational9.multiply(rational10);
    	System.out.println(multiplyResult);
    	
    	// Q13: Test the divide(Rational object) method in main method.
    	Rational rational11 = new Rational(64, 40);
    	Rational rational12 = new Rational(1, 10);
    	Rational divideResult = rational11.divide(rational12);
    	divideResult.printRational();
    }
}