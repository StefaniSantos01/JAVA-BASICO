package ExercicioAula13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Qual é o raio do circulo ?" );
		double raio = scan.nextDouble();
	    double resultado = raio * raio * 3.14;
	    double area = Math.pow(raio,3);
	    System.out.println("A area do circulo e : " + area);
	    
		
	}

}
