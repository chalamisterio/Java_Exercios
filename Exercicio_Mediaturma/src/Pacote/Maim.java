package Pacote;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Maim {

	public static void main(String[] args) {
		int num_Alunos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Número de Alunos da Turma"));
		double[] vetor_Media = new double[num_Alunos];
		String[] vetor_Nome = new String [num_Alunos];
		ArrayList<Object> lista = new ArrayList<>();

		for (int i = 0; i < num_Alunos; i++) {
			vetor_Nome[i] = JOptionPane.showInputDialog("Digite o Nome do Aluno");
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite A Primeira Nota do Aluno"));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a Segunda Nota do Aluno"));
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a Terceira Nota do Aluno"));
			vetor_Media[i] = (nota1 + nota2 + nota3) / 3;
		}

		for (int j = 0; j < vetor_Media.length; j++) {

			if (vetor_Media[j] >= 7.0) {
				lista.add(vetor_Nome[j] +" = "+ String.format("%.2f",vetor_Media[j]) + " Aprovado \n");
			} else if (vetor_Media[j] >= 3.0 && vetor_Media[j] < 7.0) {
				lista.add(vetor_Nome[j] +" = "+ String.format("%.2f",vetor_Media[j]) + " Exame \n");
			} else {
				lista.add(vetor_Nome[j] +" = "+ String.format("%.2f",vetor_Media[j]) + " Reprovado \n");
			}

		}
		 String listaFormatada = String.join(" ", lista.stream().map(Object::toString)
                 .toArray(String[]::new));
			JOptionPane.showMessageDialog(null, listaFormatada);
		}
		

	}

