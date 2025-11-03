// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
        int currentValue = Integer.parseInt(args[0]);
        String rateString = args[1];
        /*
        As rate is given as an input between 0-100,
        converting it to a percentage is accomplished by
        first dividing the input by 100, and for the output
        later multiplying it again by 100 followed by the '%'
        sign.
        */
        double rate = Double.parseDouble(rateString)/100;
        String nString = args[2];
        int n = Integer.parseInt(nString);

        double rateForProduct = Math.pow(rate+1, (double)n);
        double futureValue = currentValue * rateForProduct;

        // For convenience, output had been divided into sections.
        String yearsSection = "After " + n + " years, ";
        String currentAndRate = "$" + currentValue + " saved at " + rate*100 + "%";
        String capitalGain = " will yield $" + (int)futureValue + "\n";        
        System.out.print(yearsSection + currentAndRate + capitalGain);
	}
}
