package Exerc�ciosL�gicos;
import java.util.Scanner;
public class Ex01 {
//Fa�a um programa que calcule e apresente o valor do volume de uma lata de �leo, utilizando a f�rmula VOLUME = 3,14159 * RAIO� * ALTURA.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner InputScan = new Scanner (System.in);
		double volume_lata, pi = 3.14159, raio, altura;
		System.out.println("CALCULANDO O VOLUME DA LATA DE �LEO");
		System.out.println("Informe o raio da lata");
		raio = InputScan.nextDouble();
		System.out.println("Informe a altura da lata");
		altura = InputScan.nextDouble();
		if(raio>0 && altura>0) {
			volume_lata = pi * Math.pow(raio, 2) * altura;
			System.out.println("O volume da lata de �leo � igual a " +volume_lata);
		}else {
			System.out.println("Dados inv�lidos (medida inserida igual ou menor a zero)");
		}
		InputScan.close();
	}

}
