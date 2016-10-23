/*
 Nome: Renato Lousan da Silva
 Data: 17/10/16
 Descricao: Programa que Faz a soma de uma colecao
 */

import java.util.Scanner;

public class MediaColecao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetor[] = new int[100];
		float tam = 0;
		float total = 0;
		float media = 0;
		
		for(int k=0;k<100;k++){
			int numero = scan.nextInt();
			if(numero!=-1){
				vetor[k] = numero;
				tam = tam +1;
			}else{
				break;
				}	
		}
		for(int i = 0;i<tam;i++){
			total += vetor[i];
			media = total/tam;
		}
		System.out.printf("%.2f",media);
		scan.close();
	
	}
}
