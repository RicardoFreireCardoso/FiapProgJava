package Exerc�ciosL�gicos;

import java.util.Scanner;

/*Fa�a um programa que: 

a) Obtenha o valor para a vari�vel HT (horas trabalhadas no m�s); 
b) Obtenha o valor para a vari�vel VH (valor hora trabalhada): 
c) Obtenha o valor para a vari�vel PD (percentual de desconto); 
d) Calcule o sal�rio bruto => SB = HT * VH; 
e) Calcule o total de desconto => TD = (PD/100)*SB; 
f) Calcule o sal�rio l�quido => SL = SB � TD; 
g) Apresente os valores de: Horas trabalhadas, Sal�rio Bruto, Desconto, Sal�rio Liquido. 
*/

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double ht, vh, pd,sb,td,sl;
		System.out.println("Informe a quantidade de horas trabalhas no m�s");
		ht = in.nextDouble();
		System.out.println("Informe o valor da hora trabalhada:");
		vh = in.nextDouble();
		System.out.println("Informe o percentual de desconto:");
		pd = in.nextDouble();
		
		sb = ht * vh;
		td = (pd/100)*sb;
		sl = sb - td;
		System.out.println("1 - Horas trabalhadas: "+ht+"\n2 - Sal�rio bruto: $"+ sb+"\n3 - Desconto: "+(pd/100)+" % \n4 - Sal�rio liqu�do: $"+sl);
		in.close();
	}

}
