package programa_teste;

public class Processamento_de_dados {

	public static void main(String[] args) {
		int x , y, a, c;
		double z, b, B, h, area, resultado;
		
		x = 5;
		y = 2 * x;
		z = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("\n\n");
		System.out.println("Area do trapezio");
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = ((b + B)/2.0) * h;
		
		System.out.println(area);
		
		System.out.println("\n\n");
		System.out.println("Divisao");
		
		a = 5;
		c = 2;
		
		resultado = (double)a/c;
		System.out.println(resultado);
		
		System.out.println("\n\n");
		System.out.println("Outra operação");
		
		b = 5.0;
		a = (int)b;
		
		System.out.println(a);


		


	}

}
