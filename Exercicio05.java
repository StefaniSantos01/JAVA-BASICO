package ExercicioIfElse;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = ( nota1 + nota2 )/2 ;
		System.out.println("A media da nota é : " + media);
		
		if(media == 10){
			System.out.println("APROVADO COM DISTINÇAO");
		}
		
		if(media >= 7) {
			System.out.println("APROVADO");
		}
		else if (media <= 7) {
			System.out.println("REPROVADO");
		}
			
		}
		}
	
