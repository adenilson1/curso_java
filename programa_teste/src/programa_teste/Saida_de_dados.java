package programa_teste;


import java.util.Locale;

public class Saida_de_dados {

	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f\n",x);
		System.out.printf("%.4f\n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n",x);
		
		//Concatenar
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO =  + %.2f + METROS\n",x);
		
		// Concatenando varios elementos

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",
				nome,idade,renda);


		

	}

}
