//3) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500. 

package Manzano;

public class Exercicio03 {

	public static void main(String[] args) {

		int valor = 1, soma = 0;

		while (valor < 501) {
		  valor++;
			if (valor % 2 == 0) {
				soma = soma + valor;
			}
		}
		System.out.println(soma);
	}
}