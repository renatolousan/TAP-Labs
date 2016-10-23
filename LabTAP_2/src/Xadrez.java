/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que imprime um xadrez na tela
 */

import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int qtdeLinhas = scan.nextInt();
		scan.close();
		
		for(int i=0;i<qtdeLinhas;i++){
			if (i % 2 == 0){
				for(int j=0; j<qtdeLinhas;j++){
				System.out.print("* ");
				}
				System.out.printf("\n");
			} else {
				for(int k=0; k<qtdeLinhas;k++){
				System.out.print(" *");
				}
				System.out.printf("\n");
			}
			
		}
		
	}

}
