import java.util.Scanner;
public class CurrencyConversion {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the amount of CAD");
		
		double usd;
    	double eur;
    	double cad;

    	cad = in.nextDouble();
    	usd = cad * 0.75;
    	eur = cad * 0.68;

    	
	   	System.out.println("The amount of CAD is equal to "+usd+" USD and "+eur+" EUR");

    	in.close();



    }

}