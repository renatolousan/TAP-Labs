/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que imprime a area de um triangulo na tela
 */

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if((a+b)<=c || (a+b)<=b || (a+b)<=a || (a+c)<=b || (a+c)<=a || (a+c)<=c || (b+c)<=a || (b+c)<=b || (b+c)<c || a<=0 || b<=0 || c<=0){
			System.out.println("Triangulo invalido");
		} else {
		
		float s = (a+b+c)/2;
				
		float A = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
		scan.close();
		
		
		System.out.printf("%.2f",A);
			
	}

}
	
}
