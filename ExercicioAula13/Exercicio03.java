package ExercicioAula13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Conversor de metros para cm: ");
		System.out.println("Digite a quantidade de metros: ");
		
		double metro = scan.nextDouble();
		
		double conversor = metro * 100;
		System.out.print("A quantidade de cm é : " + conversor);
		
		
		
		

	}

}
