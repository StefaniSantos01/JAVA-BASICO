package ExercicioAula13;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	System.out.print("Digite um numero:");
	double numero1 = scan.nextDouble();
	
    System.out.print("Digite outro numero:");
	double numero2 = scan.nextDouble();	
	
	double resultado = numero1 + numero2; 
	
		
	System.out.println("O soma é : "  + resultado);

	}

}
