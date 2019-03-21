package conversores;

public class principal {

	public static void main(String[] args) {
				
		double celsius = ConversorTemperatura.converteCelsiusParaFahrenheit(10);
		System.out.println(celsius);
		
		double fahrenheit = ConversorTemperatura.converteFahrenheitParaCelsius(50);
		System.out.println(fahrenheit);

	}

}
