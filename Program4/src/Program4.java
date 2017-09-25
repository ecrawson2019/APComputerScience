/*Emma Crawson
 * AP Computer Science A
 * 09/25/2017
 * displays message
 */
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cone (); //displays first method
		box (); //displays second method
		helloBox (); //displays third method
		box ();
		cone ();
	}	
	public static void cone () {
		System.out.println("   /\\");
		System.out.println("  /  \\");
		System.out.println(" /    \\");
	}
	public static void box () {
		System.out.println("+------+");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("+------+");
	}
	public static void helloBox () {
		System.out.println("|Hello |");
		System.out.println("| World|");
	}
}
