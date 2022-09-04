package ExercicioAula14_16;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o seu genero: ");
	String genero = scan.next();
	 
	 if(genero.equalsIgnoreCase("f")){
		 System.out.println("F - Feminino");
	 }else if (genero.equalsIgnoreCase("m")){
		  System.out.println("M - Masculino");
	  }else {
		 System.out.println("Sexo invalido");
	 }
	

	}

}
