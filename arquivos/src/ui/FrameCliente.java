package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.UUID;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.clienteDao;
import model.Cliente;
import util.Util;

public class FrameCliente {

	private JLabel labelNome;
	private JTextField textNome;
	private JLabel labelCidade;
	private JTextField textCidade;
	private JLabel labelEstado;
	private JComboBox<String> comboEstado;
	private JLabel labelCep;
	private JTextField textCep;
	private JLabel labelTelefone;
	private JTextField textTelefone;
	private JLabel labelSalario;
	private JTextField textSalario;
	private JLabel labelSexo;
	private JRadioButton radioFem;
	private JRadioButton radioMas;
	private ButtonGroup radioSexo;
	private JButton buttonGravar;
	private JScrollPane scrollTable;
	private DefaultTableModel tabelasClienteModelo;
	private JTable tabelaClientes;
	
	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Cadastro de Clientes");
		tela.setSize(500, 500);
		tela.setLayout(null);

		// Nome

		labelNome = new JLabel("Nome do cliente:");
		labelNome.setBounds(20, 20, 130, 30);
		tela.getContentPane().add(labelNome);

		// Campo nome

		textNome = new JTextField();
		textNome.setBounds(20, 50, 300, 30);
		tela.getContentPane().add(textNome);

		// Cidade

		labelCidade = new JLabel("Cidade:");
		labelCidade.setBounds(20, 80, 90, 30);
		tela.getContentPane().add(labelCidade);

		// Campo cidade

		textCidade = new JTextField();
		textCidade.setBounds(20, 110, 90, 30);
		tela.getContentPane().add(textCidade);

		// Estado

		labelEstado = new JLabel("Estado:");
		labelEstado.setBounds(130, 80, 90, 30);
		tela.getContentPane().add(labelEstado);

		// Estados

		String[] estados = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB",
				"PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
		comboEstado = new JComboBox<String>(estados);
		comboEstado.setBounds(120, 110, 90, 30);
		tela.getContentPane().add(comboEstado);

		// CEP

		labelCep = new JLabel("CEP:");
		labelCep.setBounds(220, 80, 90, 30);
		tela.getContentPane().add(labelCep);

		// Campo CEP

		textCep = new JTextField();
		textCep.setBounds(220, 110, 100, 30);
		tela.getContentPane().add(textCep);

		// Telefone

		labelTelefone = new JLabel("Telefone:");
		labelTelefone.setBounds(20, 140, 90, 30);
		tela.getContentPane().add(labelTelefone);

		// Campo telefone

		textTelefone = new JTextField();
		textTelefone.setBounds(20, 170, 90, 30);
		tela.getContentPane().add(textTelefone);

		// Salï¿½rio

		labelSalario = new JLabel("Salário:");
		labelSalario.setBounds(120, 140, 90, 30);
		tela.getContentPane().add(labelSalario);

		// Campo salï¿½rio

		textSalario = new JTextField();
		textSalario.setBounds(120, 170, 90, 30);
		tela.getContentPane().add(textSalario);

		// Radio texto

		labelSexo = new JLabel("Sexo:");
		labelSexo.setBounds(220, 140, 90, 30);
		tela.getContentPane().add(labelSexo);

		// Radio feminino

		radioFem = new JRadioButton("F");
		radioFem.setSelected(true);
		radioFem.setBounds(220, 170, 50, 30);
		tela.getContentPane().add(radioFem);

		// Radio masculino

		radioMas = new JRadioButton("M");
		radioMas.setBounds(270, 170, 50, 30);
		tela.getContentPane().add(radioMas);

		// Grupo de Botï¿½es

		radioSexo = new ButtonGroup();
		radioSexo.add(radioFem);
		radioSexo.add(radioMas);

		// Botï¿½o de gravar

		buttonGravar = new JButton("Gravar cliente");
		buttonGravar.setBounds(120, 220, 200, 30);
		tela.getContentPane().add(buttonGravar);
		
		// Colunas da tabela
		
		tabelasClienteModelo = new DefaultTableModel();
		tabelasClienteModelo.addColumn("Código");
		tabelasClienteModelo.addColumn("Nome");
		tabelasClienteModelo.addColumn("Telefone");
		
		clienteDao clienteDao = new clienteDao();
		ArrayList<Cliente> clientes = clienteDao.listarClientes();
		
		for (Cliente cliente : clientes) {
		// Adicionar as linhas da tabela
			
		String[] cliente = {"0001", "Nome do cliente", "(11)9999"};
		tabelasClienteModelo.addRow(cliente);
		}
		// Criando o rolamento da tabela
		
		tabelaClientes = new JTable(tabelasClienteModelo);
		
		scrollTable = new JScrollPane();
		scrollTable.setBounds(20, 270, 300, 320);
		
		tela.getContentPane().add(tabelaClientes);
		tela.getContentPane().add(scrollTable);
		
		
		
		tela.setVisible(true);

		buttonGravar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (validarFormulario()) {
					
					Cliente cliente = new Cliente();
					cliente.setCodigo(Util.gerarCodigo());
					cliente.setNome(textNome.getText().trim().toUpperCase());
					cliente.setCidade(textCidade.getText());
					cliente.setEstado(comboEstado.getSelectedItem().toString());
					cliente.setCep(textCep.getText());
					cliente.setTelefone(textTelefone.getText());
					cliente.setSalario(Double.parseDouble(textSalario.getText()));
					cliente.setSexo(radioFem.isSelected()?'F':'M');
					
					clienteDao dao = new clienteDao(cliente);
					dao.salvar();
					System.out.println(cliente.toString());
					
					JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
				
					limparFormulario();
					
				}	else {
					
					JOptionPane.showMessageDialog(null, "Vocï¿½ deve preencher todos os campos!", "Atenï¿½ï¿½o", JOptionPane.ERROR_MESSAGE);
					
					
				}
			}
			
		});
		
	} // Fim do mï¿½todo principal
		
	private void limparFormulario() {
		textNome.setText("");
		textCidade.setText("");
		textCep.setText("");
		textSalario.setText("");
		textTelefone.setText("");
		textNome.requestFocus();
	}

	private boolean validarFormulario() {

		boolean valido = true;
		
		if(textNome.getText().trim().length() == 0) {				
			labelNome.setForeground(Color.RED);
			valido = false;
		} else if (textCidade.getText().trim().length() == 0) {
		
			labelCidade.setForeground(Color.RED);
			valido = false;
			
		} else if (textCep.getText().trim().length() == 0) {
			
			labelCep.setForeground(Color.RED);
			valido = false;
			
		} else if (textTelefone.getText().trim().length() == 0) {
			
			labelTelefone.setForeground(Color.RED);
			valido = false;
			
		} else if (textSalario.getText().trim().length() == 0) {
			
			labelSalario.setForeground(Color.RED);
			valido = false;
			
		}
		
		return valido;
		
	}
	
	
} //Fim de tudo 