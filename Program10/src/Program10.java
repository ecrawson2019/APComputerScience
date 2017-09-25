/* Emma Crawson
 * AP Computer Science A
 * 09/25/2017
 * displays recommended weights for male and female based on height 
 */
import java.util.Scanner ;
public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height, mWeight, fWeight ;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a height in inches:");
		height = in.nextInt(); //enter height
		
		mWeight= 106 + (height - 60) * 7 ; //calculates male weight 
		fWeight= 100 + (height - 60) * 6 ; //calculates female weight
		
		System.out.println("Recommended Male Weight:" + mWeight); //displays male weight
		System.out.println("Recommended Female Weight:" + fWeight); //displays female weight
		
		in.close();
		
		

	}

}
