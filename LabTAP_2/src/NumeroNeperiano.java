/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que aproxima o valor do numero neperiano
 */
import java.util.Scanner;

public class NumeroNeperiano {
	
	public static double fat(double n){
		double fact = 1;
		for (int i = 1; i <=n; i++) {
			fact = fact*i;	
		}	
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		scan.close();
		
		double neper = 0;
		
		for (int i = 0; i < k; i++) {
			neper += 1/(fat(i));
		}
		
		System.out.printf("%.6f",neper);
		
	}

}
