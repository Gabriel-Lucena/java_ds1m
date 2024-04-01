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



public class Dao {
	
	private Cliente cliente;

	private static final String LOCAL_ARQUIVO = "C:/Users/gabriel/Documents/movimento.ds1";

	public Cliente getCliente() {
		return cliente;
	}

	public Dao(Cliente cliente) {
		this.cliente = cliente;
	}

	public Dao() {

	}
	
	public void salvar() {
		Path path = Paths.get(LOCAL_ARQUIVO);

		try {

			BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"), StandardOpenOption.WRITE,
					StandardOpenOption.APPEND);

			writer.write(cliente.toString());
			writer.newLine();
			writer.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de gravar os dados :(");
			e.printStackTrace();
		}
	}
	
	public void salvar2(Cliente cliente) {
		Path path = Paths.get(LOCAL_ARQUIVO);
		
		try {

			BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"), StandardOpenOption.WRITE,
					StandardOpenOption.APPEND);
			
			
			writer.newLine();
			writer.write(cliente.toString());
			writer.close();

		} catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de gravar os dados (");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Cliente> listarClientes() {

		Path path = Paths.get(LOCAL_ARQUIVO);

		try {

			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));

			String linha = reader.readLine();
			ArrayList<Cliente> clientes = new ArrayList<>();

			while (linha != null) {
				String[] vetorCliente = linha.split(";");

				Cliente cliente = new Cliente();
				cliente.setCodigo(vetorCliente[0]);
				cliente.setPlaca(vetorCliente[1]);
				cliente.setModelo(vetorCliente[2]);
				cliente.setDataEntrada(vetorCliente[3]);
				cliente.setHoraEntrada(vetorCliente[4]);
				cliente.setDataSaida(vetorCliente[5]);
				cliente.setHoraSaida(vetorCliente[6]);

				clientes.add(cliente);

				linha = reader.readLine();
			}

			reader.close();

			return clientes;

		}

		catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de ler o arquivo (");
			e.printStackTrace();
			return null;
		}
	}
	public Cliente buscarCliente(String codigo) {

		Path path = Paths.get(LOCAL_ARQUIVO);

		try {

			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));

			String linha = reader.readLine();
			Cliente cliente = new Cliente();

			while (linha != null) {
				String[] vetorCliente = linha.split(";");

				if (vetorCliente[0].equals(codigo)) {
					cliente.setCodigo(vetorCliente[0]);
					cliente.setPlaca(vetorCliente[1]);
					cliente.setModelo(vetorCliente[2]);
					cliente.setDataEntrada(vetorCliente[3]);
					cliente.setHoraEntrada(vetorCliente[4]);
					cliente.setDataSaida(vetorCliente[5]);
					cliente.setHoraSaida(vetorCliente[6]);
					break;
				}
				linha = reader.readLine();
			}

			reader.close();

			return cliente;

		}

		catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de ler o arquivo (");
			e.printStackTrace();
			return null;
		}
	}
	
	public Cliente buscarPelaPlaca(String placa) {

		Path path = Paths.get(LOCAL_ARQUIVO);

		try {

			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));

			String linha = reader.readLine();
			Cliente cliente = new Cliente();

			while (linha != null) {
				String[] vetorCliente = linha.split(";");

				if (vetorCliente[1].equals(placa) && vetorCliente[5].equals("null")) {
					cliente.setCodigo(vetorCliente[0]);
					cliente.setPlaca(vetorCliente[1]);
					cliente.setModelo(vetorCliente[2]);
					cliente.setDataEntrada(vetorCliente[3]);
					cliente.setHoraEntrada(vetorCliente[4]);
					cliente.setDataSaida(vetorCliente[5]);
					cliente.setHoraSaida(vetorCliente[6]);
					break;
				}
				linha = reader.readLine();
			}

			reader.close();

			return cliente;

		}

		catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de ler o arquivo (");
			e.printStackTrace();
			return null;
		}
	}

}