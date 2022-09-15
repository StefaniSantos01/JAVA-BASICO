package ExercicioIfElse;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com os numeros");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		
		if (n1 >= n2 && n2 > n3  ) {
		 System.out.println("Numeros em forma decrecente :" + n1 + n2 + n3 );
		}
		else if (n1 > n3 && n3 >n2) {
			System.out.println("Numeros em forma decrecente: " +n1 + n3 + n2);
		}
		else if (n2 > n1 && n1 > n3) {
			System.out.println("Numeros em forma decrescente: " + n2 + n1 +n3);
		}
		else if (n2 > n3 && n3 > n1) {
			System.out.println("Numeros em forma decrescente: " + n2 + n3 + n1);
	}
		else if (n3 > n1 && n1 > n2) {
			System.out.println("Numeros em forma decrecente:" + n3 + n1 + n2);
		}
		else if (n3 > n2 && n2 > n1) {
			System.out.println("Numeros em forma decrecente:" + n3 + n2 + n1);
}
		else {
			System.out.println("numero em forma decrecente " + n1 + n2 + n3);
		}
	}
}