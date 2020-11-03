package ExercíciosLógicos;

import java.util.Scanner;

public class Ex03 {
	/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo. */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float custo_consumidor, custo_fabrica;
		final double impostos = 1.28, porcentagem_distribuidor= 1.45;
		Scanner in = new Scanner (System.in);
		System.out.println("Informe o valor em $ do custo de fábrica");
		custo_fabrica = in.nextFloat();
		custo_consumidor = (float) ((custo_fabrica *impostos ) * porcentagem_distribuidor);
		System.out.println("Valor do veiculo é R$ "+custo_consumidor);
		in.close();
	}

}
