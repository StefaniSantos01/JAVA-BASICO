package ExercicioAula13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voce ganha por hora ? ");
		float salario = scan.nextFloat();
		
		System.out.println("Quantas horas voce trabalha por mes ? ");
		float horas = scan.nextFloat();
		
		float resultado = salario * horas;
		System.out.println("O valor do seu salario mensal e de : " + resultado );

	}

}
