package ExercicioAula13;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
		System.out.println("Notas Bimestrais");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		double n4 = scan.nextDouble();
		
		double media = (n1 + n2 + n3 + n4)/4;
		System.out.println("A media das notas são: " + media);
	

	}

}
