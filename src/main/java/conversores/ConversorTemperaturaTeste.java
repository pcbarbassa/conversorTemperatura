package conversores;

import junit.framework.TestCase;

public class ConversorTemperaturaTeste extends TestCase{
	
	public void testeConverteCelsiusParaFahrenheit() {		  
		double celsius = 10;		
		double fahrenheit = ConversorTemperatura.converteCelsiusParaFahrenheit(celsius);		
		assertEquals(50.0, fahrenheit);
	}
	
	public void testeConverteFahrenheitParaCelsius() {		  
		double fahrenheit = 50;		
		double celsius = ConversorTemperatura.converteFahrenheitParaCelsius(fahrenheit);		
		assertEquals(10,0, celsius);
	}

}
