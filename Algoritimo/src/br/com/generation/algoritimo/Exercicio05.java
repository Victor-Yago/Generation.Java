package br.com.generation.algoritimo;

import java.util.Scanner;

//		5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
//		aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
//		respectivamente.


		public class Exercicio05 {
	


		public static void main(String[] args) {
	
			Scanner leia = new Scanner(System.in);
	
			double N1, N2, N3, media;
	
			System.out.println("Insira a 1� nota:");
			N1 = leia.nextDouble();
	
			System.out.println("Insira a 2� nota:");
			N2 = leia.nextDouble();
	
			System.out.println("Insira a 3� nota:");
			N3 = leia.nextDouble();
	
			media = ((N1*2)+(N2*3)+(N3*5))/10;
	
			System.out.println("A m�dia �:" + media);
			leia.close();
			
   }

}
