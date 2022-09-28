package BEE1036;

public class Bhaskara {
	public double Delta(double a, double b, double c)
	{
		return Math.pow(b, 2) - (4 * a * c);
	}
	
	public double PrimeiraResposta(double a, double b, double c, double delta)
	{
		return ((-b + Math.sqrt(delta)) / (2 * a));
	}
	
	public double SegundaResposta(double a, double b, double c, double delta)
	{
		return ((-b - Math.sqrt(delta)) / (2 * a));
	}
}
