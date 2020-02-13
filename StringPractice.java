public class StringPractice{

	public static void main(String[] args){

		System.out.println("String Practice");

		String hello = new String("hello");

		System.out.println(hello);

		String upHello = hello.toUpperCase();

		System.out.println(upHello);
		System.out.println(upHello.toLowerCase());

		String myBigString = "\nHello everybody, today is Thursday, "
							+"and we are having fun!";

		System.out.println(myBigString);

		System.out.println("The first index of 'o' is "
							+ myBigString.indexOf('o'));

		System.out.println("The first index of 'o' in the TRIMMED string is "
							+ (myBigString.trim()).indexOf('o')); 
		
		System.out.println("The first index of 'l' is "
							+ myBigString.lastIndexOf('l'));

		System.out.println("The substring of bigString from 2 to 8 is " +
							myBigString.substring(2,9));

		System.out.println("The substring of bigString from 2 to the end is "+
							myBigString.substring(2));


	}
}