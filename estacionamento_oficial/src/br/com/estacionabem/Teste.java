package br.com.estacionabem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import model.Cliente;
import model.Funcionario;
import model.TipoCliente;
import model.TipoVeiculo;
import model.Vaga;
import model.Veiculo;
import model.Movimento;


public class Teste {

	public static void main(String[] args) {
		
		// Datas e horas
		
		LocalDateTime dataHoraEntrada = LocalDateTime.now();
		System.out.println(dataHoraEntrada);
		
		LocalDateTime dataHoraSaida = LocalDateTime.of(2021, 5,25,12,48);
		System.out.println(dataHoraSaida);
		
		LocalDate dataNascimento = LocalDate.of(2005,06,21);
		Period tempo = Period.between(dataNascimento,LocalDate.now());
		System.out.println(tempo);
		
		long horas = ChronoUnit.HOURS.between(dataHoraEntrada, dataHoraSaida);
		long minutos = ChronoUnit.MINUTES.between(dataHoraEntrada, dataHoraSaida);
		System.out.println(horas);
		System.out.println(minutos);
		
		// Datas e horas
		
		// Clientes
	
		Cliente pedro = new Cliente();
		pedro.setTelefone("(11)74851-8956");
		pedro.setEmail("pedro.santos@uol.com.br");
		pedro.setMensalidade(200);
		pedro.setTipo(TipoCliente.MENSALISTA);
		pedro.setRg("12.562.658-25");
		pedro.setNome("Pedro dos Santos Monteiro");
		
		Cliente maria = new Cliente();
		maria.setTelefone("(11)7345-8956");
		maria.setEmail("maria.santos@uol.com.br");
		maria.setMensalidade(200);
		maria.setTipo(TipoCliente.AVULSO);
		maria.setRg("12.567.658-25");
		maria.setNome("Maria dos Santos Monteiro");
		
		// Clientes
		
		// Funcionários
		
		Funcionario joao = new Funcionario();
		joao.setDataAdmissao(LocalDate.of(2019,9,28));
		joao.setFuncao("Atendente");
		joao.setNome("João Oliveira");
		
		// Funcionários
		
		// Vagas
		
		Vaga vaga1 = new Vaga();
		vaga1.setNumeroVaga("A-001");
		vaga1.setOcupado(false);
		vaga1.setTempoTolerancia(LocalTime.of(0,10));
		vaga1.setTipoVaga(TipoVeiculo.PASSEIO);
		vaga1.setValorHora(5);
		vaga1.setValorHoraAdicional(3);
		
		Vaga vaga2 = new Vaga();
		vaga2.setNumeroVaga("A-001");
		vaga2.setOcupado(true);
		vaga2.setTempoTolerancia(LocalTime.of(0,10));
		vaga2.setTipoVaga(TipoVeiculo.PASSEIO);
		vaga2.setValorHora(5);
		vaga2.setValorHoraAdicional(3);
		
		// Vagas
		
		// Veículos
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setCliente(pedro);
		veiculo1.setCor("Amarela");
		veiculo1.setModelo("Brasília");
		veiculo1.setPlaca("ABC-4521");
		veiculo1.setTipo(TipoVeiculo.PASSEIO);
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setCliente(maria);
		veiculo2.setCor("Preto");
		veiculo2.setModelo("Twister");
		veiculo2.setPlaca("XXX-4521");
		veiculo2.setTipo(TipoVeiculo.MOTO);
		
		// Veículos
		
		// Movimentos
		
		Movimento mov1 = new Movimento();
		mov1.setVeiculo(veiculo1);
		mov1.setFuncionario(joao);
		mov1.setVaga(vaga1);
		mov1.setDataEntrada(LocalDate.of(2021, 5, 25));
		mov1.setHoraEntrada(LocalTime.of(9,18));
		
		Movimento mov2 = new Movimento();
		mov2.setVeiculo(veiculo2);
		mov2.setFuncionario(joao);
		mov2.setVaga(vaga2);
		mov2.setDataEntrada(LocalDate.of(2021, 5, 24));
		mov2.setHoraEntrada(LocalTime.of(16,51));
		
		// Movimentos
		
		// Geração
		
		gerarCupom(mov1);
	}
	
	private static void gerarCupom(Movimento m) {
		
		System.out.println("------------------------------------------------");
		System.out.println("	" + m.getVeiculo().getCliente().getNome());
		System.out.println("		" + m.getVeiculo().getPlaca());
		System.out.println("		" + m.getVeiculo().getModelo());
		System.out.println("		" + m.getVeiculo().getTipo());
		System.out.println("		" + m.getVaga().getNumeroVaga());
		System.out.println("		" + m.getDataEntrada());
		System.out.println("		" + m.getHoraEntrada());
		System.out.println("------------------------------------------------");
	}
}
