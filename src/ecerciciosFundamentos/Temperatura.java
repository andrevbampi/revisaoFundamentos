package ecerciciosFundamentos;

public class Temperatura {

	public static double converterFahrenheitParaCelsius(double temperatura) {
		return (temperatura - 32) * (5d/9.0);
	}
	
	public static double converterCelsiusParaFahrenheit(double temperatura) {
		return temperatura * 1.8 + 32;
	}
}
