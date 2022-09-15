package ExercicioIfElse;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre o numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre o segundo numero:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre o terceio numero:");
		int num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("Numero 1 é maior:" + num1);		
		}
		else if (num2 >= num1 && num2 >= num3){
			System.out.println("Numero 2 é maior:" + num2);
		}
		else if (num3 >= num1 && num3 >= num2) {
			System.out.println("Numero 3 é maior:" + num3);
	}
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("Numero 1 é menor:" + num1);		
		}
		else if (num2 <= num1 && num2 <= num3){
			System.out.println("Numero 2 é menor:" + num2);
		}
		else if (num3 <= num1 && num3 <= num2) {
			System.out.println("Numero 3 é menor:" + num3);
		}
}
}
