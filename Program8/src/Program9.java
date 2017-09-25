/* Emma Crawson
 * AP Computer Science
 * 09/25/2017
 * displays sphere's diameter, circumference, surface area, and volume  
 */
import java.util.Scanner;
public class Program9 { //actually Program8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raduis, diamter, circum, surface, volume ;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter raduis of sphere");
		raduis = in.nextDouble(); //enter radius
		
		diamter = 2*raduis ; //calculates diameter
		circum = 2*3.14*raduis ; //calculates circumference
		surface = 4*3.14*raduis*raduis ; //calculates surface
		volume = 1.3*3.14*raduis*raduis*raduis ; //calculates volume
		
		System.out.println("Diameter =" +diamter); //displays diameter
		System.out.println("Circumference =" +circum); //displays circumference
		System.out.println("Surface Area =" +surface); //displays surface area
		System.out.println("Volume =" +volume); //displays volume
		
		in.close();
		
	}

}
