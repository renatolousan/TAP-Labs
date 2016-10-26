/*
 Nome: Renato Lousan da Silva
 Data: 17/10/16
 Descricao: Programa que faz a soma de uma colecao
 */

import java.util.Scanner;

public class SomaColecao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int number = scan.nextInt();
		
		while(!(number == -1)) {
			if(number == -1){
				sum = 0;
			} else {
				sum += number;
			}
			number = scan.nextInt();
		}
		scan.close();
		System.out.println(sum);
	}

}

