import java.util.Scanner;
public class AvTemp{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What was the temperature 3 days ago?");
			int t1 = scan.nextInt();

		System.out.println("What was the temperature 2 days ago");
			int t2 = scan.nextInt();

		System.out.println("What was the temperature yesterday?");
			int t3 = scan.nextInt();

			int tav = (t1+t2+t3)/3;

		System.out.println("The average temperature is " + tav + " degrees Celsius");
	}
}