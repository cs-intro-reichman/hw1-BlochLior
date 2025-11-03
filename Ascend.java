// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int a = (int)(Math.random()*lim);
        int b = (int)(Math.random()*lim);
        int c = (int)(Math.random()*lim);
        String outString1 = "" + a + " "+ b + " " + c;
        
        int max, min, mid;
        max = Math.max(a, b);
        max = Math.max(max, c);
        min = Math.min(a, b);
        min = Math.min(min, c);
        /*
        To find the middle value without any if statement,
        a summing of the values is used to extract that value.
        */
        mid = a + b + c - max - min;
        
        String outString2 = "" + min + " " + mid + " " + max;
        System.out.println(outString1);
        System.out.println(outString2);

	}
}