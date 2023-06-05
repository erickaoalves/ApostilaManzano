//6) Elaborar  um  programa  que  apresente  como  resultado  o  valor  de  uma  potência  de  uma  base qualquer elevada 
//a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor do expoente. Observe que neste exercício 
//não pode ser utilizado o operador de exponenciação do portuguol (^).

package Manzano;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {

				Scanner sc = new Scanner (System.in);

				try {
					
				System.out.println("Digite o valor da base: ");
				int B = sc.nextInt(); //B=base;
				System.out.println("Digite o valor do expoente: ");
				int E = sc.nextInt(); //E=expoente;

				 int potencia = 1;
				 
				 for (int i = 0; i < E; i++) { 
			      potencia *= B;  
				 }

			        System.out.println("O resultado da potenciação é: " +potencia);
			        sc.close();
			        
					} catch (Exception e) {
						System.out.println("Erro. Digite apenas números!!!"+e);
					}
			    }
		}
			        

