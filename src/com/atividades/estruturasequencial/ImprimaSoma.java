package com.atividades.estruturasequencial;

import java.util.Scanner;


public class ImprimaSoma {
	public static void main(String[] args) {
		int num1;
		int num2;
		int soma;
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Digite o 1º Numero: ");
			num1 = scan.nextInt();
			System.out.println("Digite o 2º Numero: ");
			num2 = scan.nextInt();
					}
		soma = num1 + num2;
		System.out.println("A Soma dos numeros é: "+soma);
	}

}
