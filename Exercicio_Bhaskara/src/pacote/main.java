package pacote;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int i = 0;
		while(i == 0) {
			int A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite Um Valor para A"));
			int B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um Valor para B"));
			int C = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite Um Valor para C"));
			
			int delta = ((B*B)-4*A*C);
			
			if(delta < 0) {
				JOptionPane.showMessageDialog(null, " Delta Menor que Zero Raiz Não eXiste Uma Raiz Real");
				
			}else if (delta == 0) {
				double XI =(-B + Math.sqrt(delta))/(2*A);
				double XII= (-B - Math.sqrt(delta))/(2*A);
				
				JOptionPane.showMessageDialog(null,"Quando Delta for = 0 Uma das se repete \n "+ "Valor Para XI é " + XI + " Valor para XII é " + XII);
			}else {
				double XI =(-B + Math.sqrt(delta))/(2*A);
				double XII= (-B - Math.sqrt(delta))/(2*A);
				JOptionPane.showMessageDialog(null,"Os valores Calculados Para XI e XII \n" + "O Valor XI é " + String.format("%.2f", XI)+"\n"
				+ "O Valor XII é " +String.format("%.2f", XII) );
			}
			i = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 para continuar ou 1 Para Sair")); 
		}

	}

}
