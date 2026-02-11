package Pacote;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int i = 0;
		while (i == 0) {
			double salario_inf = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu Salário"));
			int num_Dependentes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Número de Dependentes"));

			if (salario_inf < 2000.00 && num_Dependentes > 2) {
				double salario_reaj = ((salario_inf * 25.5) / 100.0);
				JOptionPane.showMessageDialog(null,
						" O Salario Informado é " + String.format("%.2f", salario_inf) + "\n O número de Dependentes é "
								+ num_Dependentes + "\n O valor do Reajustado é " + String.format("%.2f", salario_reaj)
								+ "\n O valor do Reajustado com Salario informado  "
								+ String.format("%.2f", salario_reaj + salario_inf));

			} else if (salario_inf >= 2000.00 && num_Dependentes == 1) {
				double salario_reaj = ((salario_inf * 15) / 100.0);
				JOptionPane.showMessageDialog(null,
						" O Salario Informado é " + String.format("%.2f", salario_inf) + "\n O número de Dependentes é "
								+ num_Dependentes + "\n O valor do Reajustado é " + String.format("%.2f", salario_reaj)
								+ "\n O valor do Reajustado com Salario informado  "
								+ String.format("%.2f", salario_reaj + salario_inf));

			} else if (salario_inf > 3000.00 && num_Dependentes == 0) {
				double salario_reaj = ((salario_inf * 7.5) / 100.0);
				JOptionPane.showMessageDialog(null,
						" O Salario Informado é " + String.format("%.2f", salario_inf) + "\n O número de Dependentes é "
								+ num_Dependentes + "\n O valor do Reajustado é " + String.format("%.2f", salario_reaj)
								+ "\n O valor do Reajustado com Salario informado  "
								+ String.format("%.2f", salario_reaj + salario_inf));

			}

			i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 0 para Continuar ou 1 Para Sair"));

		}

	}

}
