package BEE1036;

import org.junit.Assert;
import org.junit.Test;

public class BhaskaraTeste {

	@Test
	public void deveriaRetornarDelta(double a, double b, double c)
	{
		Bhaskara bask = new Bhaskara();
		double delta = bask.Delta(1, 6, 3);
		Assert.assertEquals(24.0, delta, 0.0001);
	}
}
