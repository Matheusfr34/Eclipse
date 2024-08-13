package somardoisnumeros;

import java.util.*;

class SomarDoisNumeros {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main (String args[]){
		//Declaracao de variaveis
		int num1, num2, soma;
		//Leituras
		System.out.println("Digite um número");
		num1 = teclado.nextInt();
		System.out.println("Digite outro número");
		num2 = teclado.nextInt();
		//Somar
		soma = num1 + num2;
		//Mostrar na tela
		System.out.println("Soma:" + soma);
		}
}
