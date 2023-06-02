//4) Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar se o número
// é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução se, perguntando se o número é 
//  ímpar; sendo, mostre-o; não sendo, passe para o próximo passo. 

package Manzano;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0;

		while (i < 20) {
			i++;
			if (i %2==1) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
