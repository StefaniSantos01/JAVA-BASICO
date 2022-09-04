package ExercicioAula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero inteiro ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite outro numero inteiro ");
		int n2 = scan.nextInt();
		
		System.out.println("Digite um numero real ");
		double real = scan.nextDouble();
		
		int resultado = (n1 * 2) * (n2 / 2);
		double resultado_2 =(n1 * 3) + real ;
		double resultado_3 = real * real * real; 
		
		System.out.println("O  produto do primeiro com a metade do segundo " + resultado);
		System.out.println("A soma do triplo do primeiro com o terceiro é : " + resultado_2);
		System.out.println("O terceiro elevado ao cubo: " + resultado_3);
		
		
	}

}
