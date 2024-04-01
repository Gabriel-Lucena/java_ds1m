package ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameCliente {

	private JLabel tituloTexto;
	private JLabel entradaPlacaTexto;
	private JLabel entradaModeloTexto;
	private JTextField entradaPlacaCampo;
	private JTextField entradaModeloCampo;
	private JButton entrarBotao;
	
	// Antes da tabela
	
	// Depois da tabela
	
	private JLabel saidaTexto;
	private JLabel saidaPlacaTexto;
	private JTextField saidaPlacaCampo;
	private JButton buscarBotao;
	
	// Após o botão de busca
	
	private JLabel saidaModeloTexto;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("xpto");
		tela.setSize(500, 530);
		tela.setLayout(null);
		tela.setResizable(false);
		
		tituloTexto.setText("Entrada");
		tituloTexto.setBounds(20, 20, 130, 30);
		
		tela.getContentPane().add(tituloTexto);		
	}
	
	
	
}
