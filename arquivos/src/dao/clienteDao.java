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

public class clienteDao {

	private Cliente cliente;
	private static final String LOCAL_ARQUIVO = "C:/Users/Gabriel/clientes.ds1";
	
	public void ClienteDao(Cliente cliente) {
		this.cliente = cliente;
	};
	
	public void ClienteDao() {};
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	};

	public Cliente getCliente() {
		return this.cliente;
	};
	
	
	public clienteDao(Cliente cliente) {

		this.cliente = cliente;

	}

	public Cliente getCliente() {

		return cliente;

	}

	public void salvar() {

		Path path = Paths.get("C:/Users/Gabriel/clientes.ds1");

		try {

			BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"), StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
			
			writer.write(cliente.toString());
			writer.newLine();
			writer.close();

		} catch (Exception e) {

			System.out.println("Não foi possível gravar os dados");

		}

	}

	public static String[] listarClientes() {

		//

		Path path = Paths.get(LOCAL_ARQUIVO);

		//

		try {

			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));
			return null;

		} catch (Exception e) {

			System.out.println("Ocorreu um erro na tentativa de ler o arquivo!");
			e.printStackTrace();
			return null;

		}

	}

	public void lerArquivo() {

		// Procedimento para abrir um arquivo para leitura ou escrita

		// Passo 1 - Obter o caminho do arquivo
		Path path = Paths.get("C:/Users/Gabriel/clientes.ds1");

		// Criar o Buffer para o arquivo

		try {


			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));

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

			reader.close();
			System.out.println("Acabou");
			System.out.println(clientes);

			
			}

		 catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de ler o arquivo.");
			e.printStackTrace();
			}

	}
	
}
		


