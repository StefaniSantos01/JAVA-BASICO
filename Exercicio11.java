package ExercicioIfElse;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in);
		
		System.out.println("Entre com o seu salário atual:");
		
		double sal = scan.nextDouble();
		
		if(sal <= 280 ) {
			double salarionovo = sal * 0.2 ; 
			double total = salarionovo + sal ;
			
			System.out.println("Esse é o valor do reajuste : " + salarionovo);
			System.out.println("O  total do salario é : : " + total);
			System.out.println("Percentual dado : é 20%");
			System.out.println("o seu valor salarial antes do reajuste era de :" + sal);
		
		
	} else if (sal >= 280 && sal <= 700) {
			
			  double salario = sal * 0.15 ;
			  double total = salario + sal ;
			  
			    System.out.println("Esse é o valor do reajuste : " + salario);
				System.out.println("O  total do salario é : : " + total);
				System.out.println("Percentual dado : é 15%");
				System.out.println("o seu valor salarial antes do reajuste era de :" + sal);
				
		}else if ( sal >= 700 && sal <=1500) {
			 double salario = sal * 0.1 ;
			 double total = salario + sal ;
			    System.out.println("Esse é o valor do reajuste : " + salario);
				System.out.println("O  total do salario é : : " + total);
				System.out.println("Percentual dado : é 10%");
				System.out.println("o seu valor salarial antes do reajuste era de :" + sal);
			 
		} else if (sal <= 1500) {
			double salario = sal * 0.05;
			double total = salario + sal ;
			    System.out.println("Esse é o valor do reajuste : " + salario);
				System.out.println("O  total do salario é : : " + total);
				System.out.println("Percentual dado : é 5%");
				System.out.println("o seu valor salarial antes do reajuste era de :" + sal);
		}
		
	}
}
