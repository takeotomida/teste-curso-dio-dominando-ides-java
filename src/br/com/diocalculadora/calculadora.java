package br.com.diocalculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	
		int a, b;
		
		
		System.out.print("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.print("DIgite o segundo valor: ");
		b = scan.nextInt();

		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println ("soma: " + soma);
		System.out.println ("subtração: " + subtracao);
		System.out.println ("multiplicação: " + multiplicacao);
		System.out.println ("divisão: " + divisao);
	}	
	public static int soma (int a, int b) {
		return a + b;
	}
	public static int subtracao (int a, int b) {
		return a - b;
	}
	public static int divisao (int a, int b) {
		return a / b;
	}
	public static int multiplicacao (int a, int b) {
		return a * b;
	}
}
