import java.util.Scanner;
import java.text.DecimalFormat;
public class BMICal{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your weight: ");
		double weight = scan.nextDouble();

		System.out.println("Enter your height");
		double height = scan.nextDouble();

		double weightKg = weight/2.205;
		double heightMeters = height/3.281;

		double bmi = weightKg/(heightMeters*heightMeters);

		DecimalFormat bmiCal = new DecimalFormat("0.00");
		System.out.println("Your BMI is "+bmiCal.format(bmi));


	}
}