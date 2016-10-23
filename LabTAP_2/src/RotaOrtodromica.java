/*
 * Nome: Renato Lousan da Silva
 * Data: 14/10/2016
 * Descrição: Programa que calcula a distância entre dois potos no globo
 */
import java.util.Scanner;

public class RotaOrtodromica {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double T1 = scan.nextDouble();
		double G1 = scan.nextDouble();
		double T2 = scan.nextDouble();
		double G2 = scan.nextDouble();
		
		T1 = Math.toRadians(T1);
		G1 = Math.toRadians(G1);
		T2 = Math.toRadians(T2);
		G2 = Math.toRadians(G2);
		
		double R = 6371; // raio da terra
		
		double arcosseno = Math.acos((Math.sin(T1) * Math.sin(T2)) + (Math.cos(T1) * Math.cos(T2) * Math.cos(G1-G2)));
		
		double d = R * arcosseno;
		
		T1 = Math.toDegrees(T1);
		G1 = Math.toDegrees(G1);
		T2 = Math.toDegrees(T2);
		G2 = Math.toDegrees(G2);
		
		scan.close();
		
		System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km",T1,G1,T2,G2,d);
	}

}
