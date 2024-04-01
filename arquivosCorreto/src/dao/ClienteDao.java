package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import model.Cliente;

public class ClienteDao {

	private Cliente cliente;
	
	private static final String LOCAL_ARQUIVO = "C:/Users/gabriel/clientes.ds1";

	// Construtor que pede o cliente
	public ClienteDao(Cliente cliente) {
		this.cliente = cliente;
	}
	
	// Construtor vazio
	public ClienteDao() {
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void salvar() {
		
		Path path = Paths.get(LOCAL_ARQUIVO);

		try {
			BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"),
					StandardOpenOption.WRITE, StandardOpenOption.APPEND);

			writer.write(cliente.toString());
			writer.newLine();
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Cliente> listarClientes() {
		// Procedimento para abrir um arquivo para leitura ou escrita

		// Passo 1 - Obter o caminho do arquivo
		Path path = Paths.get(LOCAL_ARQUIVO);

		// Criar o Buffer para o arquivo
		try {

			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));

			String linha = reader.readLine();
			ArrayList<Cliente> clientes = new ArrayList<>();

			while (linha != null) {
				String[] vetorCliente = linha.split(";");
				
				Cliente cliente = new Cliente();
				cliente.setCodigo(vetorCliente[0]);
				cliente.setNome(vetorCliente[1]);
				cliente.setCidade(vetorCliente[2]);
				cliente.setEstado(vetorCliente[3]);
				cliente.setCep(vetorCliente[4]);
				cliente.setTelefone(vetorCliente[5]);
				cliente.setSalario(Double.parseDouble(vetorCliente[6]));
				cliente.setSexo(vetorCliente[7].charAt(0));
				
				clientes.add(cliente);
				
				linha = reader.readLine();
			}
			
			System.out.println(clientes);

			reader.close();
			
			return clientes;
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de ler o arquivo!");
			e.printStackTrace();
			return null;
		}
	}
	
	public Cliente buscarCliente(String codigo) {
		// Procedimento para abrir um arquivo para leitura ou escrita

		// Passo 1 - Obter o caminho do arquivo
		Path path = Paths.get(LOCAL_ARQUIVO);

		// Criar o Buffer para o arquivo
		try {

			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));

			String linha = reader.readLine();
			Cliente cliente = new Cliente();

			while (linha != null) {
				String[] vetorCliente = linha.split(";");
				
				if (vetorCliente[0].equals(codigo)) {
					
				cliente.setCodigo(vetorCliente[0]);
				cliente.setNome(vetorCliente[1]);
				cliente.setCidade(vetorCliente[2]);
				cliente.setEstado(vetorCliente[3]);
				cliente.setCep(vetorCliente[4]);
				cliente.setTelefone(vetorCliente[5]);
				cliente.setSalario(Double.parseDouble(vetorCliente[6]));
				cliente.setSexo(vetorCliente[7].charAt(0));
				
				break;
				}
				linha = reader.readLine();
			}
			
			System.out.println(cliente);

			reader.close();
			
			return cliente;
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de ler o arquivo!");
			e.printStackTrace();
			return null;
		}
	}
	
}