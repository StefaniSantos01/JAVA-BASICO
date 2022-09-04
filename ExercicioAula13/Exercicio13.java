package ExercicioAula13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	 System.out.println("Qual é o tamanho do arquivo(MB) ");
	 int MB = scan.nextInt();
	 
	 System.out.println("Qual é a velocidade da sua internet (MB/s) ? ");
	 double velocidade = scan.nextDouble();
	 double tempo = MB / velocidade ;
	 double resultado = tempo / 60;
	 
	 System.out.println("Voce ira gastar : " + resultado );
	 
	 

	}

}
