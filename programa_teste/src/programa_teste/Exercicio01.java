package programa_teste;

import java.util.Locale;

public class Exercicio01 {

	public static void main(String[] args) {
		// Programa com varias variaveis
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double prince1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.234567;
		
		// Out
		System.out.printf("Products:\n"
				+ "%s, whitch prince is $ %.2f\n"
				+ "%s, whitch prince is $ %.2f\n\n",
				product1, prince1,product2,prince2);
		
		System.out.printf("Record: %d years old, code %d "
				+ "and gender:%s\n\n", age,code,gender);
		
		System.out.printf("Measure with eight decimal places: "
				+ "%.8f\n", measure);
		
		System.out.printf("Rouded (three decimal places): %.3f\n"
				,measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f",measure);

	}

}
