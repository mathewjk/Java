import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Mortgage Calculator");
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Principal: ");
	    int principal = scanner.nextInt();
		System.out.print("Time in Years: ");
		int year = scanner.nextInt();
		System.out.print("Annual rate:");
	    double rate = scanner.nextDouble();
	    year = year*12;
	    rate = rate/100/12;
	    double mortgage = principal * rate * Math.pow(rate + 1, (double)year );
	    mortgage = mortgage / (Math.pow(rate + 1, (double)year) - 1);
	    String formattedout = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formattedout);
    }
}
