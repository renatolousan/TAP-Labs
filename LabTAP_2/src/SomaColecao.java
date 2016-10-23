
/*
 Nome: Renato Lousan da Silva
 Data: 17/10/16
 Descricao: Programa que Faz a soma de uma colecao
 */

import java.util.Scanner;

public class SomaColecao {
	
	public static void SomaColecoes(int vet[]){
		Scanner scan = new Scanner(System.in);
		int tam = 0;
		int total = 0;
		
		for(int k=0;k<100;k++){
			int numero = scan.nextInt();
				vet[k] = numero;
				tam = tam +1;
				
			if(vet[k] == -1 && scan.nextInt() == -1){
				break;
			}

		}
		
		for(int l=0;l<tam;l++){
		System.out.println(vet[l]);
		}
			
		
	}
	
	
	public static void main(String[] args) {
		int vetor[] = new int[100];
		SomaColecoes(vetor);
		
		}
	
	}

