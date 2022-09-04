package ExercicioAula13;

import java.util.Scanner;

public class Exercicio01teste {

public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
 
	System.out.println("Digite um numero: ");
	double n1 = scan.nextDouble();
	
	System.out.println("Digite outro numero : ");
	double n2 = scan.nextDouble();
	
	double soma = n1 + n2 ;
	System.out.println("A soma total é : " + soma);

	}

}


