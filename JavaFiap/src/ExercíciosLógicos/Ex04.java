package ExercíciosLógicos;

import java.util.Scanner;

/*Faça um programa que: 

a) Obtenha o valor para a variável HT (horas trabalhadas no mês); 
b) Obtenha o valor para a variável VH (valor hora trabalhada): 
c) Obtenha o valor para a variável PD (percentual de desconto); 
d) Calcule o salário bruto => SB = HT * VH; 
e) Calcule o total de desconto => TD = (PD/100)*SB; 
f) Calcule o salário líquido => SL = SB – TD; 
g) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário Liquido. 
*/

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double ht, vh, pd,sb,td,sl;
		System.out.println("Informe a quantidade de horas trabalhas no mês");
		ht = in.nextDouble();
		System.out.println("Informe o valor da hora trabalhada:");
		vh = in.nextDouble();
		System.out.println("Informe o percentual de desconto:");
		pd = in.nextDouble();
		
		sb = ht * vh;
		td = (pd/100)*sb;
		sl = sb - td;
		System.out.println("1 - Horas trabalhadas: "+ht+"\n2 - Salário bruto: $"+ sb+"\n3 - Desconto: "+(pd/100)+" % \n4 - Salário liquído: $"+sl);
		in.close();
	}

}
