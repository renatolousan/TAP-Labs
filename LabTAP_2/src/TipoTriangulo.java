/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descri��o: Programa que diz qual o tipo do triangulo inserido
 */
import java.util.Scanner;

public class TipoTriangulo {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			scan.close();
			
			if((a+b)<c || (a+c)<b || (b+c)<a || a<0 || b<0 || c<0){
				
				System.out.printf("invalido");
				
			} else {
			if(a==b && a==c && c==b){
				
				System.out.println("equilatero");
				
			} else {
			if(a==b || a==c || c==b){
				
				System.out.println("isosceles");
				
			} else {
				System.out.println("escaleno");
			}
				
			
			}
			}
		}
}
