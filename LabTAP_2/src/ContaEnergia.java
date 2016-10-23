/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que calcula a conta de energia
 */

import java.util.Scanner;

public class ContaEnergia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double preco = scan.nextFloat();
		double precoFinal = 0;
		char instalacao = scan.next().charAt(0);
		
		switch (instalacao) {
		case 'R':
			if(preco < 0){
				System.out.printf("-1.00");
			} else {
			if(preco <= 500){
				precoFinal = (preco * 0.40);
				System.out.printf("%,2f",precoFinal);
			} else {
				precoFinal = (preco * 0.65);
				System.out.printf("%,2f",precoFinal);
			}
			}
			break;
		
		case 'C':
			if(preco < 0){
				System.out.printf("-1.00");
			} else {
			if(preco <= 1000){
				precoFinal = (preco * 0.55);
				System.out.printf("%.2f",precoFinal);
			} else {
				precoFinal = (preco * 0.60);
				System.out.printf("%,2f",precoFinal);
			}
			}
			break;
			
		case 'I':
			if(preco < 0){
				System.out.printf("-1.00");
			} else {
			if(preco <= 5000){
				precoFinal = (preco * 0.55);
				System.out.printf("%.2f",precoFinal);
			} else {
				precoFinal = (preco * 0.60);
				System.out.printf("%.2f",precoFinal);
			}
		}
			break;
		default:
			System.out.printf("-1.00"); 
			break;
		}
		scan.close();
	}

}
