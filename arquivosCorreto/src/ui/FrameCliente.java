package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

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

import dao.ClienteDao;
import model.Cliente;
import util.Util;

public class FrameCliente {

	private JLabel labelNome;
	private JTextField textNome;
	private JLabel labelCidade;
	private JTextField textCidade;
	private JLabel labelEstado;
	private JComboBox<String> comboEstados;
	private JLabel labelCep;
	private JTextField textCep;
	private JLabel labelTelefone;
	private JTextField textTelefone;
	private JLabel labelSalario;
	private JTextField textSalario;
	private JLabel labelSexo;
	private ButtonGroup radio;
	private JRadioButton radioFem;
	private JRadioButton radioMasc;
	private JButton buttonGravar;
	
	private JTable tabelaClientes;
	private DefaultTableModel tabelaClientesModel;
	private JScrollPane scrollTabelaClientes;
	
	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Cadastro de Clientes");
		tela.setSize(500, 530);
		tela.setLayout(null);
		tela.setResizable(false);

		labelNome = new JLabel("Nome do cliente:");
		labelNome.setBounds(20, 20, 130, 30);
		textNome = new JTextField();
		textNome.setBounds(20, 50, 300, 30);

		labelCidade = new JLabel("Cidade");
		labelCidade.setBounds(20, 80, 90, 30);
		textCidade = new JTextField();
		textCidade.setBounds(20, 110, 90, 30);

		labelEstado = new JLabel("Estado");
		labelEstado.setBounds(120, 80, 90, 30);
		String[] estados = { "SP", "RJ", "SC", "PE", "CE", "AM" };
		comboEstados = new JComboBox<String>(estados);
		comboEstados.setBounds(120, 110, 90, 30);
		comboEstados.setToolTipText("Selecione um estado");

		labelCep = new JLabel("CEP:");
		labelCep.setBounds(220, 80, 90, 30);
		textCep = new JTextField();
		textCep.setBounds(220, 110, 100, 30);

		labelTelefone = new JLabel("Telefone:");
		labelTelefone.setBounds(20, 140, 90, 30);
		textTelefone = new JTextField();
		textTelefone.setBounds(20, 170, 90, 30);

		labelSalario = new JLabel("Salário:");
		labelSalario.setBounds(120, 140, 90, 30);
		textSalario = new JTextField();
		textSalario.setBounds(120, 170, 90, 30);

		labelSexo = new JLabel("Sexo:");
		labelSexo.setBounds(220, 140, 90, 30);

		radio = new ButtonGroup();

		radioFem = new JRadioButton("F");

		radioFem.setBounds(220, 170, 50, 30);
		radioFem.setSelected(true);
		radioMasc = new JRadioButton("M");
		radioMasc.setBounds(270, 170, 50, 30);
		radio.add(radioMasc);
		radio.add(radioFem);

		buttonGravar = new JButton("Gravar Cliente");
		buttonGravar.setBounds(120, 220, 200, 30);
		
		criarTabela(tela);
		
		tela.getContentPane().add(labelNome);
		tela.getContentPane().add(textNome);
		tela.getContentPane().add(labelCidade);
		tela.getContentPane().add(textCidade);
		tela.getContentPane().add(labelEstado);
		tela.getContentPane().add(comboEstados);
		tela.getContentPane().add(labelCep);
		tela.getContentPane().add(textCep);
		tela.getContentPane().add(labelTelefone);
		tela.getContentPane().add(textTelefone);
		tela.getContentPane().add(labelSalario);
		tela.getContentPane().add(textSalario);
		tela.getContentPane().add(labelSexo);
		tela.getContentPane().add(radioFem);
		tela.getContentPane().add(radioMasc);
		tela.getContentPane().add(buttonGravar);

		tela.setVisible(true);

		// Ouvinte de ação/evento para o botão gravar cliente
		buttonGravar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (validarFormulario()) {
					Cliente cliente = new Cliente();
					cliente.setCodigo(Util.gerarCodigo());
					cliente.setNome(textNome.getText().toUpperCase());
					cliente.setCidade(textCidade.getText().toUpperCase());
					cliente.setEstado(comboEstados.getSelectedItem().toString());
					cliente.setCep(textCep.getText());
					cliente.setTelefone(textTelefone.getText());
					cliente.setSalario(Double.parseDouble(textSalario.getText()));
					cliente.setSexo(radioFem.isSelected() ? 'F' : 'M');

					ClienteDao dao = new ClienteDao(cliente);
					dao.salvar();

					JOptionPane.showMessageDialog(
							null, 
							cliente.getNome() + "\nCadastrado(a) com sucesso!!",
							"Sucesso",
							JOptionPane.INFORMATION_MESSAGE);

					limparFormulario();
					
				} else {
					JOptionPane.showMessageDialog(
							null,
							"Você deve preencher todos os campos!",
							"Atenção",
							JOptionPane.WARNING_MESSAGE);
					
				}
				
				

			}
		});
		
		tabelaClientes.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
				int linha = tabelaClientes.getSelectedRow();
				String codigo = tabelaClientes.getModel().getValueAt(linha, 0).toString();
				
				ClienteDao dao = new ClienteDao();
				Cliente cliente = dao.buscarCliente(codigo);
				
				textNome.setText(cliente.getNome());
				textCep.setText(cliente.getCep());
				textCidade.setText(cliente.getCidade());
				textSalario.setText(String.valueOf(cliente.getSalario()));
				textTelefone.setText(cliente.getTelefone());
				
				if (cliente.getSexo() == 'M') {
					
					radioMasc.setSelected(true);
				} else {
					
					radioFem.setSelected(true);
				}
				
				comboEstados.setSelectedItem(cliente.getEstado());
			}
		});

	} // fim do método criarTela

	private void criarTabela(JFrame tela) {
		// *** Criar modelo da Tabela (colunas e linhas)
		tabelaClientesModel = new DefaultTableModel();
		tabelaClientesModel.addColumn("Código");
		tabelaClientesModel.addColumn("Nome");
		tabelaClientesModel.addColumn("Telefone");
		
		// *** Vetor que representa cada linha da tabela
		ClienteDao clienteDao = new ClienteDao();
		ArrayList<Cliente> clientes = clienteDao.listarClientes();
		
		for (Cliente cliente : clientes) {
			String[] vetorCliente = {cliente.getCodigo(), cliente.getNome(), cliente.getTelefone()};
			tabelaClientesModel.addRow(vetorCliente);
		}
		
		
		
		
		// *** Criar a tabela
		tabelaClientes = new JTable(tabelaClientesModel);
		
		// *** Determinar a largura das colunas
		
		tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(90);
		tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
		tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(110);
		
		// *** Não permitir mudar o tamanho da coluna
		
		tabelaClientes.getColumnModel().getColumn(0).setResizable(false);
		
		// *** Não 
		
		tabelaClientes.getAccessibleContext();
		
		// *** Criar o painel de rolagem (Scroll) e inserir a tabela nele
		scrollTabelaClientes = new JScrollPane(tabelaClientes);
		scrollTabelaClientes.setBounds(20, 270, 450, 200);
		
		tela.getContentPane().add(scrollTabelaClientes);
	}
	
	private boolean validarFormulario() {
		
		boolean valido = true;
		
		if (textNome.getText().trim().length() == 0) {
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
	
	private void limparFormulario() {
		textNome.setText("");
		textCidade.setText("");
		textCep.setText("");
		textSalario.setText("");
		textTelefone.setText("");
		textNome.requestFocus();
	}

} // fim da classe
