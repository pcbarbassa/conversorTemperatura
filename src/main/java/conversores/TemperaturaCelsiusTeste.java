package conversores;

import junit.framework.TestCase;

public class TemperaturaCelsiusTeste extends TestCase{
	
	public void testConverteCelsiusParaFahrenheit() {
		TemperaturaCelsius temp = new TemperaturaCelsius(0);

		double expResult = 32.0;	
		assertEquals(expResult, temp.converteCelsiusParaFahrenheit());
	}
}
