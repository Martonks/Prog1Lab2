import java.util.Scanner;
public class NameFormat{
	
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("What is your name? (last, first):");
		String fullname = scan.nextLine();
		int index = fullname.indexOf(',');

		String last = fullname.substring(0,index);
		String first = fullname.substring(index+2);

		first = (first.substring(0,1)).toUpperCase()+first.substring(1).toLowerCase();
		last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

	System.out.println("Formatted name: "+first+" "+last);
	
	}
}