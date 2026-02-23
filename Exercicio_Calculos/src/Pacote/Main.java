package Pacote;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int valor_Informado = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite o Número Para Realizar Os Calculos"));

		long retorno_Fatorial = calcula_Fatorial(valor_Informado);
		int retorno_SomaNaturais = calcula_SomaNaturais(valor_Informado);
		ArrayList<Integer> retorno_ImpareseEm50 = calcula_ImparesEm50(valor_Informado);
		imprime_Resultados(valor_Informado, retorno_Fatorial, retorno_SomaNaturais, retorno_ImpareseEm50);

	}

	private static void imprime_Resultados(int valor_Informado, long retorno_Fatorial, int retorno_SomaNaturais,
			ArrayList<Integer> retorno_ImpareseEm50) {
		String listaFormatada = String.join(",",
				retorno_ImpareseEm50.stream().map(Object::toString).toArray(String[]::new));
		JOptionPane.showMessageDialog(null,
				"Valor Informado é = " + valor_Informado + "\n" + "Soma dos Número Naturais até o Numero Informado é = "
						+ retorno_SomaNaturais + "\n" + "Fatorial do Valor Informado é = " + retorno_Fatorial + "\n"
						+ "Os Número Impares abaixo de 50 ou os númeoros acima de 50 são = " + listaFormatada);

	}

	private static ArrayList<Integer> calcula_ImparesEm50(int valor_Informado) {
		ArrayList<Integer> lista = new ArrayList<>();

		if (valor_Informado <= 50) {
			for (int i = valor_Informado; i <= 50; i++) {
				if (i % 2 == 1) {
					lista.add(i);

				}
			}

		} else if (valor_Informado > 50) {

			for (int i = 50; i <= valor_Informado; i++) {
				if (i % 2 == 1) {
					lista.add(i);
				}
			}
		}
		return lista;
	}

	private static int calcula_SomaNaturais(int valor_Informado) {
		int somaNaturais = 0;
		for (int i = 0; i <= valor_Informado; i++) {
			somaNaturais += i;

		}
		return somaNaturais;

	}

	private static long calcula_Fatorial(long valor_Informado) {
		long fatorial = 1;
		for (int i = 1; i <= valor_Informado; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}

}
