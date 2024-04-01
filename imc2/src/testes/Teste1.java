package testes;

import br.senai.sp.jandira.model.Aluno;

public class Teste1 {

	public void testarAluno() {
		Aluno ama = new Aluno();
		ama.nome = "Ana Maria Braga";
		ama.email = "ana.maria@bol.com.br";
		ama.idade = 69;
		ama.matricula = "XPXP";
		ama.peso = 55;
		ama.altura = 1.60;
		
		System.out.printf("Nome: ", ama.nome);
	}
	
}
