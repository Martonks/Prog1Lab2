import java.util.Scanner;
public class BMICal{

	 public static void main(String[] args) {
	 	Scanner in = new Scanner(System.in);
	 	double weight = Scanner.nextDouble();
	 	double height = Scanner.nextDouble();

	 	double bmi = weight/(height^2);

	 	System.out.println("Your BMI is equal to " + bmi);

	 	in.close();
	 }

}

    
