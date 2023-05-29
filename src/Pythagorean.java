import java.util.Scanner;

public class Pythagorean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("pls choose which one to Compute \n\n[A] Pythagorean,  [B] Area of the Triangle \n\nInput : ");
		char i =input.next().charAt(0);
		
		switch (i){ 
		
		case 'a':
		
		System.out.print("Enter the length of the first side:");
		double a = input.nextDouble();

		System.out.print("Enter the length of the Second side:");
		double b = input.nextDouble();
		
		double hyp = Math.sqrt((a * a) + (b * b));
		/*double rounded = Math.round(hyp * 100)/100.00;*/
		System.out.print("Hypotenuse: " + 3f%hyp);
		
		
		break;
		
		case 'b':

			System.out.print("Enter the base length of the triangle:");
			double B = input.nextDouble();

			System.out.print("Enter the height of the triangle:");
			double H = input.nextDouble();
			
			double area = (0.5*(B * H));
			
			System.out.print("Area: " + area);
			break;
			default:
				System.out.print("Invalid");
		}

	}
      
	
}
