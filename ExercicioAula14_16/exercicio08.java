package ExercicioAula14_16;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
	System.out.println("Preco do primeiro produto");	
	double preco1 = scan.nextDouble();
	System.out.println("Preco do segundo produto");	
	double preco2 = scan.nextDouble();
	System.out.println("Preco do terceiro produto");	
	double preco3 = scan.nextDouble();
	
	if(preco1 <= preco2 && preco1 <= preco3) {
		System.out.println("O mais barato é :" + preco1);
	}
	else if (preco2 <= preco1 && preco2 <= preco3){
		System.out.println("O mais barato é :" + preco2);
	}
	else if (preco3 <= preco1 && preco3 <= preco2) {
		System.out.println("O mais barato é :" + preco3);
	}
	}
}
