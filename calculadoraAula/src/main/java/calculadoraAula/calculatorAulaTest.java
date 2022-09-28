package calculadoraAula;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class calculatorAulaTest {
	
	@Test
	public void deveriaSomarDoisNumeros()
	{
		calculatorAula cal = new calculatorAula();
		int soma = cal.Somar(7, 3);
		Assert.assertEquals(10, soma);
	}
	
	@Test
	public void deveriaSubtrairDoisNumeros()
	{
		calculatorAula cal = new calculatorAula();
		int subtracao = cal.Subtracao(7, 3);
		Assert.assertEquals(4, subtracao);
	}
	
	@Test
	public void deveriaMultiplicarDoisNumeros()
	{
		calculatorAula cal = new calculatorAula();
		int multiplicar = cal.Multiplicacao(7, 3);
		Assert.assertEquals(21, multiplicar);
	}
	
	@Test
	public void deveriaDividirDoisNumeros()
	{
		calculatorAula cal = new calculatorAula();
		double divisao = cal.Divisao(7, 3);
		Assert.assertEquals(2,3, divisao);
	}
}
