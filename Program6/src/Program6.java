/*Emma Crawson
 * AP Computer Science A
 * 09/25/2017
 * displays a series of *
 */
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stars1 (); //displays first method
		stars2 (); //displays second method
		stars3 (); //displays third method
	}
	public static void stars1 () {
		System.out.println("    *****    "); //displays *
		System.out.println("  *********  ");
		System.out.println("*************");
		
	}
	public static void stars2 () {
		System.out.println("\n\n"); //starts two new lines
		stars1 (); //displays first method
		System.out.println("* | | | | | *"); //displays | and *
		System.out.println("*************"); //displays *
		stars1(); //displays first method
	}
	public static void stars3 () {
		System.out.println("\n\n"); //starts two new lines
		stars1 (); //displays first method
		System.out.println("    *****    "); //displays *
		System.out.println("* | | | | | *"); //displays | and *
		System.out.println("* | | | | | *"); 
		System.out.println("    *****    ");
		System.out.println("    *****    ");
	}
}
