package ExercicioIfElse;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in) ;
		
	 System.out.println("Digite o numero: ");
		int n1 = scan.nextInt ();
	 System.out.println("Digite outro numero: ");
		int n2 = scan.nextInt();
		
		if(n1 > n2) {
			System.out.println("O maior deles é : " + n1);
		}
		else { 
			System.out.println("o maior deles é: " + n2);
		}
		
			
		
		
}
	}

	


