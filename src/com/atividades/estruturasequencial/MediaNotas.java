package com.atividades.estruturasequencial;

// 4.Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int num4;
		double nota;
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Informe sua 1º nota:");
			num1 = scan.nextInt();
			System.out.println("Informe sua 2º nota:");
			num2 = scan.nextInt();
			System.out.println("Informe sua 3º nota:");
			num3 = scan.nextInt();
			System.out.println("Informe sua 4º nota");
			num4 = scan.nextInt();
			
			nota = (num1+num2+num3+num4)/4;
					
		}
		System.out.println("Sua Média é: " +nota);
		
	}

}
