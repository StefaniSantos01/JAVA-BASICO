package ExercicioAula14_16;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Entre com uma letra:");
	String letra = scan.next();

	
	switch (letra) {
	case "a":
	case "e":
	case "i":
	case "o":
	case "u":System.out.println("E uma vogal");break;
	default: System.out.println ("E uma consoante");
	

		
		
	}
	}
}