package test;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		double[] faturamentos;

		double maiorFaturamento = 0;
		double menorFaturamento = 999999;
		double somaDosFaturamentos = 0;

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		System.out.println("Digite a quantidade de dias de faturamento:");
		faturamentos = new double[read.nextInt()];

		for (int i = 0; i < faturamentos.length; i++) {
			System.out.println("Digite o faturamento do " + (i + 1) + "° dia");
			faturamentos[i] = read.nextDouble();
			somaDosFaturamentos += faturamentos[i];
		}

		double mediaDosFaturamentos = somaDosFaturamentos / faturamentos.length;
		int diasFaturamentoMaiorMediaMensal = 0;

		for (int i = 0; i < faturamentos.length; i++) {

			if (faturamentos[i] > maiorFaturamento) {
				maiorFaturamento = faturamentos[i];
			} else if (faturamentos[i] < menorFaturamento) {
				menorFaturamento = faturamentos[i];
			}
			if (faturamentos[i] > mediaDosFaturamentos) {
				diasFaturamentoMaiorMediaMensal++;
			}
		}
		System.out.println("O MENOR faturamento no dia foi: R$ " + menorFaturamento);
		System.out.println("O MAIOR faturamento no dia foi: R$ " + maiorFaturamento);
        System.out.println(diasFaturamentoMaiorMediaMensal + " dias foram superiores ao FATURAMENTO MÉDIO MENSAL!");

	}
}
