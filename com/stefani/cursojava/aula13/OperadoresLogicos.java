package com.stefani.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1; 
		int valor2 = 2;
		
		boolean resultado = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 AND  valor2 é 2 - resultado: " + resultado);
		
		
		boolean resultado1 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado);
		
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && false);		
		System.out.println(verdadeiro || false);
		System.out.println(verdadeiro ^ false);
		System.out.println(!verdadeiro && false);
		
	
	}

}
