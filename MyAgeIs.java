import java.util.Scanner;
public class MyAgeIs {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("What year were you born in?");
    	int yearOfBirth = scan.nextInt();
    	int currentYear = 2020;
    	
    	int age;

    	age = currentYear - yearOfBirth;

    	System.out.println("You are " + age + " years old");
         
    }

}
