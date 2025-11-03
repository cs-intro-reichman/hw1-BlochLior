// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        int moneyInt = Integer.parseInt(args[3]);
        double moneyDouble = (double)moneyInt;
        double value = Math.ceil(moneyDouble/3);
        
        // For convenience, output string was divided to two
        String namesString = "Dear " + name3 + ", " + name2 + ", and " + name1;
        String paymentString = ": pay " + value + " Shekels each.";
        System.out.println(namesString + paymentString);
	}
}
