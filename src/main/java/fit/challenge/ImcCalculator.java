package fit.challenge;

/**
 * Classe responsável por realizar o calculo do IMC 
 * 
 */
public class ImcCalculator {

	private static final String MAGREZA = "Magreza";
	private static final String NORMAL = "Normal";
	private static final String SOBREPESO = "Sobrepeso";
	private static final String OBESIDADE = "Obesidade";
	
	public static String calculate(double peso, double altura) {
		double valor = 0;
		double indice = calculaImc(peso, altura);
	    
	    return verificaIndiceIme(indice, valor);
	    
	}

	private static double calculaImc(double peso, double altura) {
		return peso / Math.pow(altura, 2);
	}

	private static String verificaIndiceIme(double indice, double valor) {
	    if (indice < 18.5) return MAGREZA;
	    if (indice < 24.9) return NORMAL;
	    if (indice < 30) return SOBREPESO;
	    return OBESIDADE;
	}
}
