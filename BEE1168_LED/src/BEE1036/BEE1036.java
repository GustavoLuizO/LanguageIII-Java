package BEE1036;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1036 {

	public static void main(String[] args) {
		Bhaskara x = new Bhaskara();
		double a = x.Delta(1, 6, 3);
		System.out.println(a);
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		double delta = (B * B) - (4 * A * C);
		
		if (delta < 0 || A == 0)
			System.out.println("Impossivel calcular");
		else
		{
			double r1 = ((-B + Math.sqrt(delta)) / (2 * A));
			double r2 = ((-B - Math.sqrt(delta)) / (2 * A));
			
			DecimalFormat frmt = new DecimalFormat();
			frmt.setMaximumFractionDigits(5);
			
			System.out.println("R1 = " + frmt.format(r1));
			System.out.println("R2 = " + frmt.format(r2));
		}
		input.close();
	}
}
