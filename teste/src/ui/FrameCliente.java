package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.Dao;
import model.Cliente;
import util.Util;

public class FrameCliente {

	Font fonte1 = new Font("Consolas", Font.BOLD, 22);
	Color verde = new Color(134, 173, 95);
	Color vermelho = new Color(255, 13, 3);
	Color azul = new Color(78, 143, 208);

	private JLabel entradaTexto;
	private JLabel placaTexto;
	private JTextField placaCampo;
	private JLabel modeloTexto;
	private DefaultTableModel tabelaClientesModelo;
	private JButton botaoEntrar;
	private JLabel placaTexto2;
	private JTable tabelaCliente;
	private JButton botaoBuscar;
	private JScrollPane scrollTable;
	private JLabel saidaTexto;
	private JTextField modeloTexto2;
	private JTextField placatexto2;
	private JLabel horaSaidaTexto;
	private JLabel labelModelo2;
	private JTextField tempoTexto;
	private JLabel labelDataEntrada;
	private JTextField textDataEntrada;
	private JLabel labelHoraEntrada;
	private JTextField textHoraEntrada;
	private JLabel labelDataSaida;
	private JTextField dataSaidaTexto;
	private JTextField textHoraSaida;
	private JLabel labelTempo;
	private JTextField textModelo;
	private JLabel labelValorPagar;
	private JTextField textValorPagar;
	private JButton botaoEfetuarSaida;
	private JButton botaoFecharSistema;

	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Estacionamento");
		tela.setSize(700, 550);
		tela.setLayout(null);
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);

		entradaTexto = new JLabel("Entrada");
		entradaTexto.setBounds(20, 20, 130, 30);
		entradaTexto.setFont(fonte1);
		entradaTexto.setForeground(verde);

		placaTexto = new JLabel("Placa:");
		placaTexto.setBounds(20, 50, 130, 30);

		placaCampo = new JTextField();
		placaCampo.setBounds(20, 80, 200, 30);

		modeloTexto = new JLabel("Modelo:");
		modeloTexto.setBounds(250, 50, 130, 30);

		textModelo = new JTextField();
		textModelo.setBounds(250, 80, 200, 30);

		botaoEntrar = new JButton("Entrar");
		botaoEntrar.setBounds(530, 80, 100, 30);
		botaoEntrar.setForeground(Color.WHITE);
		botaoEntrar.setBackground(azul);

		criarTabela();

		scrollTable = new JScrollPane(tabelaCliente);
		scrollTable.setBounds(20, 110, 650, 160);

		saidaTexto = new JLabel("Saída");
		saidaTexto.setBounds(20, 275, 130, 30);
		saidaTexto.setFont(fonte1);
		saidaTexto.setForeground(verde);

		placaTexto2 = new JLabel("Placa:");
		placaTexto2.setBounds(20, 300, 130, 30);

		placatexto2 = new JTextField();
		placatexto2.setBounds(20, 330, 200, 30);

		botaoBuscar = new JButton("Buscar");
		botaoBuscar.setBounds(270, 330, 130, 30);
		botaoBuscar.setBackground(azul);
		botaoBuscar.setForeground(Color.WHITE);

		labelModelo2 = new JLabel("Modelo: ");
		labelModelo2.setBounds(20, 360, 130, 30);

		modeloTexto2 = new JTextField();
		modeloTexto2.setBounds(20, 390, 100, 30);

		labelDataEntrada = new JLabel("Data de Entrada:");
		labelDataEntrada.setBounds(130, 360, 130, 30);

		textDataEntrada = new JTextField();
		textDataEntrada.setBounds(130, 390, 100, 30);

		labelHoraEntrada = new JLabel("Hora de Entrada:");
		labelHoraEntrada.setBounds(240, 360, 130, 30);

		textHoraEntrada = new JTextField();
		textHoraEntrada.setBounds(240, 390, 100, 30);

		labelDataSaida = new JLabel("Data de Saída:");
		labelDataSaida.setBounds(350, 360, 130, 30);

		dataSaidaTexto = new JTextField();
		dataSaidaTexto.setBounds(350, 390, 100, 30);

		horaSaidaTexto = new JLabel("Hora de Saída: ");
		horaSaidaTexto.setBounds(460, 360, 130, 30);

		textHoraSaida = new JTextField();
		textHoraSaida.setBounds(460, 390, 100, 30);

		labelTempo = new JLabel("Tempo:");
		labelTempo.setBounds(570, 360, 130, 30);

		tempoTexto = new JTextField();
		tempoTexto.setBounds(570, 390, 100, 30);

		labelValorPagar = new JLabel("Valor a Pagar:");
		labelValorPagar.setBounds(20, 450, 130, 30);

		textValorPagar = new JTextField();
		textValorPagar.setBounds(100, 450, 130, 30);

		botaoEfetuarSaida = new JButton("Efetuar Saída");
		botaoEfetuarSaida.setBounds(320, 450, 130, 30);
		botaoEfetuarSaida.setBackground(azul);
		botaoEfetuarSaida.setForeground(Color.WHITE);

		botaoFecharSistema = new JButton("Fechar Sistema");
		botaoFecharSistema.setBounds(460, 450, 130, 30);
		botaoFecharSistema.setBackground(vermelho);
		botaoFecharSistema.setForeground(Color.WHITE);

		tela.getContentPane().add(entradaTexto);
		tela.getContentPane().add(placaTexto);
		tela.getContentPane().add(placaCampo);
		tela.getContentPane().add(modeloTexto);
		tela.getContentPane().add(textModelo);
		tela.getContentPane().add(botaoEntrar);
		tela.getContentPane().add(saidaTexto);
		tela.getContentPane().add(placaTexto2);
		tela.getContentPane().add(placatexto2);
		tela.getContentPane().add(botaoBuscar);
		tela.getContentPane().add(labelModelo2);
		tela.getContentPane().add(modeloTexto2);
		tela.getContentPane().add(labelDataEntrada);
		tela.getContentPane().add(textDataEntrada);
		tela.getContentPane().add(labelHoraEntrada);
		tela.getContentPane().add(textHoraEntrada);
		tela.getContentPane().add(labelDataSaida);
		tela.getContentPane().add(dataSaidaTexto);
		tela.getContentPane().add(horaSaidaTexto);
		tela.getContentPane().add(textHoraSaida);
		tela.getContentPane().add(labelTempo);
		tela.getContentPane().add(tempoTexto);
		tela.getContentPane().add(labelValorPagar);
		tela.getContentPane().add(textValorPagar);
		tela.getContentPane().add(botaoEfetuarSaida);
		tela.getContentPane().add(botaoFecharSistema);
		tela.getContentPane().add(scrollTable);

		tela.setVisible(true);
		
		//// se return for pressionado...
		
//		textModelo.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				if () {
//					
//					buttonEntrar.requestFocus();
//				}
//				
//			}
//		});
		
		////

		botaoEntrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (validarFormulario()) {

					Cliente cliente = new Cliente();
					cliente.setCodigo(Util.gerarCodigo());
					cliente.setPlaca(placaCampo.getText().trim().toUpperCase());
					cliente.setModelo(textModelo.getText().toUpperCase());
					cliente.setDataEntrada(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
					cliente.setHoraEntrada(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));

					Dao dao = new Dao(cliente);
					dao.salvar();

					JOptionPane.showMessageDialog(null, "O cliente entrou no estacionamento!");
					
					limparFormulario();
										
				} 
				else {
					JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos", "Atenção!",
							JOptionPane.WARNING_MESSAGE);
				}

			}

		});
				
		botaoBuscar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String placa = placatexto2.getText().toUpperCase();
				
				Dao dao = new Dao();
				Cliente cliente = dao.buscarPelaPlaca(placa);

				placatexto2.setText(cliente.getPlaca());
				modeloTexto2.setText(cliente.getModelo());
				textDataEntrada.setText(cliente.getDataEntrada());
				textHoraEntrada.setText(cliente.getHoraEntrada());
				dataSaidaTexto.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString());
				textHoraSaida.setText(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")).toString());
				
				cliente.setDataSaida(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString());
				cliente.setHoraSaida(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")).toString());
				cliente.setTempoGasto(cliente.getTempoGasto());
				
				JOptionPane.showMessageDialog(null, "O cliente ficou " + cliente.getTempoGasto()/60 + " horas e " + (cliente.getTempoGasto() - (cliente.getTempoGasto()/60)*60) + " minutos", "Tempo gasto", JOptionPane.PLAIN_MESSAGE);
				
				dao.salvar2(cliente);
												
			}
		});;

	}

	private void criarTabela() {

		tabelaClientesModelo = new DefaultTableModel();

		tabelaClientesModelo.addColumn("Código");
		tabelaClientesModelo.addColumn("Placa");
		tabelaClientesModelo.addColumn("Modelo");
		tabelaClientesModelo.addColumn("Data de Entrada");

		Dao clienteDao = new Dao();
		ArrayList<Cliente> clientes = clienteDao.listarClientes();

		for (Cliente cliente : clientes) {
			String[] vetorCliente = { cliente.getCodigo(), cliente.getPlaca(), cliente.getModelo(),
					cliente.getDataEntrada() };
			tabelaClientesModelo.addRow(vetorCliente);
			
		}

		tabelaCliente = new JTable(tabelaClientesModelo);
		
		tabelaCliente.getAccessibleContext();
		
		tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(200);
		tabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(200);
		tabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(200);

		tabelaCliente.getColumnModel().getColumn(0).setResizable(false);
		tabelaCliente.getColumnModel().getColumn(1).setResizable(false);
		tabelaCliente.getColumnModel().getColumn(2).setResizable(false);
		tabelaCliente.getColumnModel().getColumn(3).setResizable(false);

		tabelaCliente.getTableHeader().setReorderingAllowed(false);
		
	}

	private boolean validarFormulario() {

		boolean valido = true;

		if (placaCampo.getText().trim().length() == 0) {
			placaTexto.setForeground(Color.RED);
			valido = false;
		} else if (textModelo.getText().trim().length() == 0) {
			modeloTexto.setForeground(Color.RED);
			valido = false;
		}

		return valido;

	}

	private void limparFormulario() {

		placaCampo.setText("");
		textModelo.setText("");

	}
	

}