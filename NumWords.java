// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    String numString = args[0];
        int num = Integer.parseInt(numString);
        int hundreds = num/100%10;
        int tens = num/10%10;
        int ones = num%10;
        String outString = "" + hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.";
        System.out.println(outString);
	}
}
