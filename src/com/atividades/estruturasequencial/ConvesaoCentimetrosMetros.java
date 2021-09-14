package com.atividades.estruturasequencial;

//5. Faça um Programa que converta metros para centímetros.
import java.util.Scanner;


public class ConvesaoCentimetrosMetros {
	public static void main(String[] args) {
		int comprimento;
		double convert;
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("informe o comprimento em centimetros: ");
			comprimento = scan.nextInt();
			
			convert = comprimento/100;			
					
		}
		System.out.println("O comprimento é: "+convert+" metros.");
	}



}
