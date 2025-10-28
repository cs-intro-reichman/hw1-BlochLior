// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String currentValueString = args[0];
        int currentValue = Integer.parseInt(currentValueString);
        String rateString = args[1];
        double rate = Double.parseDouble(rateString)/100;
        String nString = args[2];
        int n = Integer.parseInt(nString);

        double rateForProduct = Math.pow(rate+1, (double)n);
        double futureValue = currentValue * rateForProduct;

        String outpuString = "After " + n + " years, $" + 
            currentValueString + " saved at " + rate*100 + 
            "% will yield $" + (int)futureValue;
        
        System.out.println(outpuString);


	}
}
