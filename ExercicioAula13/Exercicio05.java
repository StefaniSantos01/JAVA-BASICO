package ExercicioAula13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Qual altura do quadrado? ");
	float altura = scan.nextFloat();
	float resultado = (altura * altura) * 2 ;
	System.out.println("O dobro da area é :" + resultado);
	
	

	}

}
