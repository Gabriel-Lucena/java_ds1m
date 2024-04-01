package arquivos;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;

import ui.FrameCliente;

public class App {

	public static void main(String[] args) {
		
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			if ("Nimbus".equals(info.getName())) {
			UIManager.setLookAndFeel(info.getClassName());
			break;
			}
			}
			} catch (UnsupportedLookAndFeelException e) {}
			catch (ClassNotFoundException e) {}
			catch (InstantiationException e) {}
			catch (IllegalAccessException e) {}
		
		FrameCliente tela = new FrameCliente();
		tela.criarTela();
		
	}		
}