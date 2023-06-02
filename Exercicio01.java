//1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

package Manzano;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        
		int contadora=1;
		
		while (contadora<11) {
			System.out.println(valor+" x "+contadora+" = "+valor*contadora);
			contadora++;
		}
		sc.close();

	}

}
