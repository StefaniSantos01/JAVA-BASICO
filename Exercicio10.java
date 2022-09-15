package ExercicioIfElse;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ("System.in");
		
		System.out.println("Em qual turno voce estuda? ");
		String turno = scan.next();
		
		if(turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia! M - Matutino");
	}else if (turno.equalsIgnoreCase("T")) {
		System.out.println("Boa tarde ! V - Vespertino");

}else if (turno.equalsIgnoreCase("N")) {
	System.out.println("Boa noite! N - Nortuno");
}
}
}