// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        String money = args[3];
        int moneyInt = Integer.parseInt(money);
        double moneyDouble = (double)moneyInt;
        double value = Math.ceil(moneyDouble/3);
        String outputString = "Dear " + name1 + ", " + 
        name2 + ", and " + name3 + ": pay " + 
        value + " Shekels each.";
        System.out.println(outputString);
	}
}
