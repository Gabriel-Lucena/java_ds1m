package br.sena.sp.jandira;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import br.sena.sp.jandira.model.Cliente;
import br.sena.sp.jandira.model.Conta;
import br.sena.sp.jandira.model.Empresa;

public class App {

	public static void main(String[] args) {

		/**
		 * Scanner s = new Scanner(System.in);
		 * 
		 * JFrame tela = new JFrame(); tela.setTitle("Minha tela");
		 * tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); tela.setSize(500, 400);
		 * tela.setLayout(null); tela.setVisible(true); JTextField txtNome = new
		 * JTextField(); txtNome.setBounds(50, 50, 80, 30);
		 * 
		 * JButton btnTeste = new JButton(); btnTeste.setBounds(140, 50, 100, 30);
		 * btnTeste.setText("Clique-me"); btnTeste.setVisible(true);
		 * 
		 **/

		Empresa senai = new Empresa();
		senai.setNome("SENAI \"Prof. Vicente Amato\"");
		senai.setCidade("Jandira");
		senai.setTelefone("aaa");
		
		// Primeiro cliente

		Cliente fernando = new Cliente();
		fernando.setCodigo(125);
		fernando.setNome("Fernando Leonid");
		fernando.setDataNascimento(LocalDate.of(1950, 06, 29));
		fernando.setEmail("fernando@terra.com");
		fernando.setTelefone("(11)78459-5623");
		fernando.setSalario(2000);
		fernando.setEmpresa(senai);

		Conta conta1 = new Conta(fernando);

		conta1.setNumeroConta("45785-8");
		conta1.setAgencia("0002");
		conta1.setBanco("Bradesco");
		conta1.setDataAbertura(LocalDate.of(2021, 5, 10));

		// Segundo cliente

		Cliente luiz = new Cliente();
		luiz.setCodigo(521);
		luiz.setNome("Luiz Antonio");
		luiz.setDataNascimento(LocalDate.of(1980, 8 , 21));
		luiz.setEmail("luiz@terra.com");
		luiz.setEmpresa(senai);
		luiz.setSalario(3000);
		luiz.setTelefone("(11)1245-8956");

		Conta conta2 = new Conta(luiz);


		/**
		 * Conta conta2 = new Conta("Luiz Antonio"); Conta conta4 = new Conta("Mygol");
		 * 
		 * conta2.setNumeroConta("45121-9"); conta2.setAgencia("0002");
		 * conta2.setBanco("Bradesco"); conta2.setDataAbertura(LocalDate.now());
		 */

		conta1.depositar(1000);


		exibirExtrato(conta1);
		System.out.println("---------------------");
		System.out.println("Saldo de: " + conta2.getSaldo());

		conta1.transferir(conta2, 1001);

		
		exibirExtrato(conta1);
		System.out.println("---------------------");
		System.out.println("Saldo de: " + conta2.getSaldo());


		Cliente fabiana = new Cliente();
		fabiana.setCodigo(458);
		System.out.println("" + fabiana.getCodigo());

	}

	// Fim do programa

	public static void exibirExtrato(Conta conta) {
		System.out.println("Banco: " + conta.getBanco());
		System.out.println("E-mail: " + conta.getCliente().getEmail());
		System.out.println("Empresa: " + conta.getCliente().getEmpresa().getNome());
		System.out.println("Nome: " + conta.getCliente().getNome());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Data de abertura: " + conta.getDataAbertura());
		System.out.println("Salário: " + conta.getCliente().getSalario());
		System.out.println("-------------------------");

		DateTimeFormatter formata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataPortugues = formata.format(conta.getDataAbertura());

		System.out.println("Data: " + dataPortugues);
		System.out.println("-------------------------");

	}

}
