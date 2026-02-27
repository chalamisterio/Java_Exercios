package Pacote;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int tamanho_Vetor = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Digite Um Valor Para o Tamnho do Vetor"));
		int[] vetor_A = new int[tamanho_Vetor];
		int[] vetor_B = new int[tamanho_Vetor];
		int[] vetor_Soma = new int[tamanho_Vetor];
		int[] vetor_Subtracao = new int[tamanho_Vetor];
		int[] vetor_Multiplicao = new int[tamanho_Vetor];
		ArrayList<Object> lista = new ArrayList<>();

		for (int i = 0; i < tamanho_Vetor; i++) {
			vetor_A[i] = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Digite um Valor Para a Posição " + i + " do Vetor A"));
		}

		for (int j = 0; j < tamanho_Vetor; j++) {
			vetor_B[j] = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Digite um Valor Para a Posição " + j + " do Vetor B"));
		}
		for (int z = 0; z < tamanho_Vetor; z++) {
			vetor_Soma[z] = vetor_A[z] + vetor_B[z];
			vetor_Subtracao[z] = vetor_A[z] - vetor_B[z];
			vetor_Multiplicao[z] = vetor_A[z] * vetor_B[z];
			if (vetor_B[z] == 0) {
				lista.add("Diviçao por Zero");
			} else {
				lista.add(vetor_A[z] / vetor_B[z]);
			}
		}
		
		String vetorA = Arrays.toString(vetor_A);
		String resultado1 = vetorA.replace("[", "").replace("]", "").replace(", ", " ");
		String vetorB = Arrays.toString(vetor_B);
		String resultado2 = vetorB.replace("[", "").replace("]", "").replace(", ", " ");
		String vetorSoma = Arrays.toString(vetor_Soma);
		String resultado3 = vetorSoma.replace("[", "").replace("]", "").replace(", ", " ");
		String vetorSutracao = Arrays.toString(vetor_Subtracao);
		String resultado4 = vetorSutracao.replace("[", "").replace("]", "").replace(", ", " ");
		String vetorMultiplicacao = Arrays.toString(vetor_Multiplicao);
		String resultado5 = vetorMultiplicacao.replace("[", "").replace("]", "").replace(", ", " ");
		String listaFormatada = String.join(",",
			lista.stream().map(Object::toString).toArray(String[]::new));
		
			JOptionPane.showMessageDialog(null," Valores do Vetor A=> " + resultado1 +"\n Valores do Vetor B => " + resultado2
					+ "\n Valores da Soma dos Vetor A e Vetor B => " + resultado3 + 
					"\n Valores da Subtração dos Vetor A e Vetor B => " + resultado4 +
					"\n Valores da Multiplição dos Vetor A e Vetor B => " + resultado5 +
					"\n Valores da Divição dos Vetor A e Vetor B => " +listaFormatada);
		}
	}


