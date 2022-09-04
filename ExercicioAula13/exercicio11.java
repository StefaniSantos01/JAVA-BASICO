package ExercicioAula13;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual é a sua altura? ");
		double altura = scan.nextDouble();
		double resultado = (72.7 * altura) - 58;
		
		System.out.println("O seu peso ideal é: " + resultado);

	}

}
