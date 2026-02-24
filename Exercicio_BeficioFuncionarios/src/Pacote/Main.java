package Pacote;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nomeFuncionario = JOptionPane.showInputDialog(null, "Digite o Nome do Funcionario");
		double valorSalario = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Digite o Valor do Salario Atual do Funcionario"));
		int tempoDeServiço = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Quantos Anos de Serviço"));
		int idadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do Funcionario"));
		int qtdDependentes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Quantide de Dependentes"));

		boolean retorno_DireitoBeneficio = calculaDireitoBeneficio(tempoDeServiço, idadeFuncionarios);
		double retorno_ValorBeneficio = calculaValorBeneficio(valorSalario, qtdDependentes);
		double retorno_RejusteSalario = calcularNovoSal(valorSalario, retorno_ValorBeneficio);
		imprimirDados(nomeFuncionario, valorSalario, tempoDeServiço, idadeFuncionarios, qtdDependentes,
				retorno_DireitoBeneficio, retorno_ValorBeneficio, retorno_RejusteSalario);
	}

	private static void imprimirDados(String nomeFuncionario, double valorSalario, int tempoDeServiço,
			int idadeFuncionarios, int qtdDependentes, boolean retorno_DireitoBeneficio, double retorno_ValorBeneficio,
			double retorno_RejusteSalario) {
		if (retorno_DireitoBeneficio == false) {
			JOptionPane.showMessageDialog(null, nomeFuncionario + " => Não tem Direto ao Beneficio");
		} else {
			JOptionPane.showMessageDialog(null,
					nomeFuncionario + " => Tem Direito ao Beneficio \n" + "Idade Funcionario => " + idadeFuncionarios
							+ "\n Tempo de Serviço => " + tempoDeServiço + "\n Quantidade de Dependentes => "
							+ qtdDependentes + "\n Valor do Salario Atual => " + valorSalario
							+ "\n Valor do Beneficio => " + retorno_ValorBeneficio
							+ "\n Valor do Salario Reajustado => " + retorno_RejusteSalario);
		}

	}

	private static double calcularNovoSal(double valorSalario, double retorno_ValorBeneficio) {
		double auxi = valorSalario + retorno_ValorBeneficio;
		return auxi;
	}

	private static double calculaValorBeneficio(double valorSalario, int qtdDependentes) {
		double auxi = 0;
		if (valorSalario <= 1500.00 && qtdDependentes <= 2) {
			auxi = 500.00;
		} else if (valorSalario <= 1500.00 && qtdDependentes > 2) {
			auxi = 800.00;
		} else if (valorSalario > 1500.00 && qtdDependentes <= 2) {
			auxi = 300.00;
		} else if (valorSalario > 1500.00 && qtdDependentes > 2) {
			auxi = 500.00;
		}

		return auxi;
	}

	private static boolean calculaDireitoBeneficio(int tempoDeServiço, int idadeFuncionarios) {
		boolean auxi;
		if (tempoDeServiço >= 10 && idadeFuncionarios >= 30) {
			;
			auxi = true;
		} else {
			auxi = false;
		}
		return auxi;
	}

}
