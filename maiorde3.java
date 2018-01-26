package Funçao;

import java.util.Scanner;

public class Funçao {

	private static Scanner dados;

	public static void main(String[] args) {
		dados = new Scanner (System.in);
		double x, y, z, maiorde3;
		//Variaveis
		System.out.println("Qual o primeiro número?");
		x = dados.nextDouble();
		System.out.println("Qual o segundo número?");
		y = dados.nextDouble();
		System.out.println("Qual o terceiro número?");
		z = dados.nextDouble();
		
		if (x>y)
			maiorde3 = x;
		else if (y>z)
			maiorde3 = y;
		else 
			maiorde3 = z;
		System.out.print("Maior = " +maiorde3);
                
        }
}
