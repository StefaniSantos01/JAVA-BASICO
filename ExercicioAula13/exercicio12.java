package ExercicioAula13;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voce ganha por hora? ");
		float valor = scan.nextFloat();
		
		System.out.println("Quantas horas voce trabalha por mes? ");
		float hora = scan.nextFloat();
		
		double salariobruto = valor * hora;
		double INSS = (salariobruto * 8 )/ 100;
		double sindicato = (salariobruto * 0.05);
		double SL = (salariobruto * 0.76);
		
		System.out.println("Salario Bruto : " + salariobruto );
		System.out.println(" Inss : " + INSS );
		System.out.println("Sindicato : " + sindicato);
		System.out.println("Salario Liquido : " + SL );

	}

}
