package programa_teste;

import java.util.Locale;
//import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados_01 {

	public static void main(String[] args) {
		//entrada é feito pelo
		//scanner sc = new Scanner(System.in)
		
		//para lê palavras
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String palavra; palavra = sc.next();
		 * System.out.println("Você digitou: "+palavra);
		 * 
		 * 
		 * 
		 * sc.close();
		 */
		
		
		//para cle numeros inteiros
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int numero;
		 * 
		 * numero = sc.nextInt(); 
		 * System.err.println("Você digitou: "+numero);
		 * 
		 * sc.close();
		 */
		
		
		// para le numero flutuante(double)
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * double numerof; numerof = sc.nextDouble();
		 * System.out.printf("Você digitou: %.2f%n",numerof);
		 * 
		 * sc.close();
		 */
		
		// para le um caracter
		
		/*
		 * Scanner sc = new Scanner(System.in); char letra; letra = sc.next().charAt(0);
		 * System.out.println("Voce digitou: "+letra); sc.close();
		 */
		
		//para le vairos dados na mesma linha
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String palavra;
		int numero_i;
		double numero_f;
		
		palavra = sc.next();
		numero_i = sc.nextInt();
		numero_f = sc.nextDouble();
		
		System.out.printf("Você digitou:%n%s%n%d%n%.2f%n",
				palavra,numero_i,numero_f);
		sc.close();

		
		
		
		
	}

}
