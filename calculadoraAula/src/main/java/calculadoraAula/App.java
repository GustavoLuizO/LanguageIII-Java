package calculadoraAula;

import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {
		calculatorAula calA = new calculatorAula();
		
		System.out.println(calA.Somar(10, 2));
		
		System.out.println(calA.Subtracao(10, 2));
		
		System.out.println(calA.Multiplicacao(10, 2));
		
		DecimalFormat frmt = new DecimalFormat();
		frmt.setMaximumFractionDigits(2);
		double result = calA.Divisao(10, 3);
		System.out.println(frmt.format(result));

	}

}
