package com.atividades.estruturasequencial;

//  Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].


import java.util.Scanner;
public class PedirNumero {
	public static void main(String[] args) {
		int num;
		
		try (Scanner scan = new Scanner (System.in)) {
			
			System.out.println("Digite um numero:");
			num = scan.nextInt();
		}
		System.out.println("O numero informado foi: " +num);
	}
}
