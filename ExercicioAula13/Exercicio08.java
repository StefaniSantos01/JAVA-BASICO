package ExercicioAula13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos graus Farenheit está fazendo hoje ? ");
		
		double f = scan.nextDouble();
		double c = 5* (f - 32) / 9 ;
		
		System.out.println(" A temperatura em Celsius é: " + c );
		
		
		

	}

}
