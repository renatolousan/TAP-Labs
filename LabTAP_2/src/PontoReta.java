/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que confirma se um ponto está numa reta de 1o grau
 */


import java.util.Scanner;

public class PontoReta {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			float px = scan.nextFloat();
			float py = scan.nextFloat();
			scan.close();
			
			float reta = (2*px) + py;
			
			if(reta == 3){
				System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.",px,py);
			} else{
				System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.",px,py);
			}
		}
}
