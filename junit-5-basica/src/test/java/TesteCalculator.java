import org.junit.Assert;
import org.junit.jupiter.api.Test;

import models.calculater;

public class TesteCalculator {
	@Test
	public void deveriaSomarDoisNumeros()
	{
		calculater cal = new calculater();
		int soma = cal.Somar(7, 3);
		Assert.assertEquals(10, soma);
	}
	
	@Test
	public void deveriaSubtrairDoisNumeros()
	{
		calculater cal = new calculater();
		int subtracao = cal.Subtracao(7, 3);
		Assert.assertEquals(4, subtracao);
	}
	
	@Test
	public void deveriaMultiplicarDoisNumeros()
	{
		calculater cal = new calculater();
		int multiplicar = cal.Multiplicacao(7, 3);
		Assert.assertEquals(20, multiplicar);
	}
	
	@Test
	public void deveriaDividirDoisNumeros()
	{
		calculater cal = new calculater();
		double divisao = cal.Divisao(7, 3);
		Assert.assertEquals(2,3, divisao);
	}
}
