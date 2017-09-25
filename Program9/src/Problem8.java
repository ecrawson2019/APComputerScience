/* Emma Crawson
 * AP Computer Science A
 * 09/25/2017
 * displays area of trapezoid
 */
import java.util.Scanner;
public class Problem8 { //actually program 9

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height, tBase, bBase, area ;
		Scanner in = new Scanner(System.in);
		System.out.println("Area of a Trapezoid Calculator");
		System.out.println("Enter the height of the trapezoid:");
		height = in.nextDouble(); //enter height
		System.out.println("Enter the length of the bottom base:");
		bBase = in.nextDouble(); //enter bottom base
		System.out.println("Enter the length of the top base:");
		tBase = in.nextDouble(); //enter top base
		
		area = 0.5*(tBase + bBase)*height ; //calculates area
		
		System.out.println("The area is:");
		System.out.println(area);
		
		
		in.close();
		
	}

}
