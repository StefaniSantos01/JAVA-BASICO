package ExercicioAula13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
				
		System.out.println("Quantos graus Celsius faz hoje ? ");
				
		double c = scan.nextDouble();
		double f = (9 * c / 5) + 32 ;
				
		System.out.println("A temperatura em Farenheit é : " + f);
		
	}

}
