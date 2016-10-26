/*
 Nome: Renato Lousan da Silva
 Data: 17/10/16
 Descricao: Programa que calcula a mediana de uma colecao
 */

import java.util.Scanner;

public class Mediana {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetor[] = new int[100];
		int tam = 0;
		
		for(int k=0;k<100;k++){
			int numero = scan.nextInt();
			if(numero!=-1){
				vetor[k] = numero;
				tam = tam +1;
			}else{
				break;
				}	
		}
		
		if(tam % 2 == 0){
			float elementoCentral = tam/2;
			double medianaPar = (vetor[(int) elementoCentral] + vetor[(int) (elementoCentral - 1)]) / 2.0;
			System.out.println(medianaPar);
		} else {
			float medianaImpar = vetor[(int)Math.floor(tam/2)];
			System.out.println(medianaImpar);
		}
		scan.close();
	
	}

}
