package Exerc�ciosL�gicos;

import java.util.Scanner;

public class Ex02 {
	/*	Fazer um programa que leia uma temperatura em graus Celsius e apresent�-la convertida em graus Fahrenheit. A f�rmula de convers�o �: F= (9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c, f;
		final double ajuste = 160;
		final int divisor =5;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Insira a temperatura em Celsius para converter: ");
		c = entrada.nextDouble();
		f =( 9*c +ajuste) / divisor;
		System.out.println("A temperatura em Fahrenheit �: "+f+" F");
		entrada.close();
	}

}
