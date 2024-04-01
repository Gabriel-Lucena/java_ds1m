package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

import ui.FrameCliente;

public class LerEscreverArquivo {

	public static void main(String[] args) {

//		escreverArquivo();
//		lerArquivo();

		String codigo = UUID.randomUUID().toString();
		System.out.println(codigo);
		
		String novoCodigo = codigo.substring(5);
		System.out.println(novoCodigo);
		
		String novoCodigo2 = codigo.substring(3,6);
		System.out.println(novoCodigo2);
		
		String teste = "SEnAI";
		System.out.println(teste.toLowerCase());
		
//		FrameCliente tela = new FrameCliente();
//		tela.criarTela();

	}

	private static void escreverArquivo() {

		Path path = Paths.get("C:/Users/Gabriel/clientes.ds1");

		try {

			BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("ISO-8859-1"),
					StandardOpenOption.CREATE, StandardOpenOption.APPEND);

			writer.write("0006;ARNOLD SCHWARZENEGGER;LOS ANGELES;CA;033201-888;(22)4512-4510;");
			writer.newLine();
			writer.close();

		} catch (Exception e) {

			System.out.println("Não foi possível gravar os dados");

		}

	}

	private static void lerArquivo() {

		// Procedimento para abrir um arquivo para leitura ou escrita

		// Passo 1 - Obter o caminho do arquivo
		Path path = Paths.get("C:/Users/Gabriel/clientes.ds1");

		// Criar o Buffer para o arquivo

		try {

			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));

			String linha = reader.readLine();

			while (linha != null) {

				String[] cliente = linha.split(";");

				if (cliente[3].equals("CA")) {

					System.out.printf("Código: %s - Nome: %s - Salário: %s\n", cliente[0], cliente[1], cliente[6]);
					break;

				}

				System.out.printf("Código: %s - Nome: %s - Salário: %s\n", cliente[0], cliente[1], cliente[6]);
				linha = reader.readLine();

			}

		} catch (Exception e) {

			System.out.println("Ocorreu um erro na tentativa de ler o arquivo.");

		}

	}

}