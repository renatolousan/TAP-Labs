/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que aproxima o valor do numero neperiano
 */
import java.util.Scanner;

public class AproximacaoSeno {
	
	public static double fat(double n){
		double fact = 1;
		for (int i = 1; i <=n; i++) {
			fact = fact*i;	
		}	
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double angGrau = scan.nextDouble();
		int k = scan.nextInt();
		scan.close();
		
		double exp = 3;
		double sen = 0;
		
		sen = Math.toRadians(angGrau);
		
		for(int i = 0; i<k;i++){
			if(i%2==0){
				sen += -(Math.pow(sen, exp)/fat(exp)); 
			} else {
				sen += Math.pow(sen, exp)/fat(exp); 
			}
			System.out.printf("%.10f\n",sen);
			exp = exp + 2;
			
		}
		
	}

}