package Pacote;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
int numero =0;
		
		int i = 0;
		int primo = 0;
		while (i == 0) {
			int retorno =0;
			 numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Um Para Verificar se é Primo "));
			if (numero == 1) {
				System.out.println("Número deve Maior que 1 para testar");
			} else {
				for (int L = 1; L <=numero; L++) {
					System.out.println("agora foi"+L);
					
					if (numero%L == 0) {
						System.out.println("Foi");
						 retorno= retorno +1;
						 
					}

				}
			
				if( retorno == 2) {
					System.out.println("O número digitado é " + numero + " Ele é Primo");
				}else if(retorno > 2) {
					System.out.println("O número digitado + " + numero + " Ele não Primo");
				}
			}
			numero= 0;
			i=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 Para Continuar ou -1 Para Sair"));
		}
		
	}
}
