/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que imprime as aproximacoes do pi na tela
 */
import java.util.Scanner;

public class AproximacaoPi{
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double soma = 3.0;
		double denom1 = 2.0;
		double denom2 = 3.0;
		double denom3 = 4.0;
		
		double aprox = scan.nextDouble();
		
		System.out.printf("%.6f\n",soma);
		
		for(int i = 1; i<aprox;i++){
			if(i%2==0){
				soma += -4/(denom1*denom2*denom3); 
			} else {
				soma += 4/(denom1*denom2*denom3);
			}
			System.out.printf("%.6f\n",soma);
			denom1 = denom1 + 2;
			denom2 = denom2 + 2;
			denom3 = denom3 + 2;
			
		}
		scan.close();
		
	}
		
		
}