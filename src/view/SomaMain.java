package view;
import controller.SomaCtrl;
import javax.swing.JOptionPane;

public class SomaMain {
	public static void main (String args[]){
		
		//pega o valor das somas
		double v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1o valor de soma"));
		double v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2o valor de soma"));
		
		//passa o valor das somas no controle
		double total = SomaCtrl.soma(v1, v2);
		
		//exibe o total
		JOptionPane.showMessageDialog(null, "O total foi de: " + total);
		
	}
}
