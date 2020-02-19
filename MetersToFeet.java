import java.util.Scanner;
public class MetersToFeet {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("How many meters would you like to convert to feet?");
		double meters = scan.nextDouble();
    	double feet;

    	feet = meters * 3.28084;

    	System.out.println(meters+" meters is equal to "+feet+" feet"); 	
         
    }

}