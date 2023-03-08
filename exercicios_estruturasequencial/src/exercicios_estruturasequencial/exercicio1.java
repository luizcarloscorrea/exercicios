package exercicios_estruturasequencial;
import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double arroz = sc.nextDouble();
		double feijao = sc.nextDouble();
		
		double valor = arroz + feijao;
				
		System.out.printf("PREÇO FINAL = %.2f%n", valor);
	
		
		sc.close();
		
	}

}
