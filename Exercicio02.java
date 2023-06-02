//2) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

package Manzano;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		int contador = 0, valor = 0, soma = 0;

		while (contador <= 100) {
			soma = valor + contador; 
			contador++;
			valor = soma;
		}
		System.out.println(soma);
		sc.close();
	}
	
}