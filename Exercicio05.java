//5) Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser considerado  que
// qualquer  número  elevado  a  zero  é  1,  e  elevado  a  1  é  ele  próprio.  Observe  que neste exercício não pode 
// ser utilizado o operador de exponenciação do portuguol (^).


package Manzano;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int base = 3, resultado = 1, expoente = 0, resposta = 1;
		
		System.out.println(3+" "+0+" = "+resposta);
		
		while (expoente<15) {
			expoente++;
			resultado *= base;
			
			System.out.println(base+" "+expoente+" = "+resultado);
		}
		
		sc.close();

	}
}
