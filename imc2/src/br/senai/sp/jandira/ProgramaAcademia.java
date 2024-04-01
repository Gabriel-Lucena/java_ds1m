package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.testes.Teste1;

public class ProgramaAcademia {

	public static void main(String[] args) {

		Aluno ana = new Aluno();
		Aluno pedro = new Aluno();
		pedro.nome = "Pedro";
		pedro.email = "pedro@terra.com";
		pedro.idade = 21;
		pedro.matricula = "443a3";
		ana.nome = "Pedro";
		ana.email = "ana@bol.com";
		ana.idade = 12;
		ana.matricula = "aaaaa";
		ana.altura = 1.85;
		ana.peso = 66;
		
		System.out.printf("%s \n",ana.cumprimentar());
		System.out.printf("Nome:%s \n Idade:%s \n E-mail:%s \n Matrícula:%s \n IMC:%s \n"
				,ana.nome,ana.idade,ana.email,ana.matricula,ana.calcularImc());
		System.out.printf("Status:%s \n",ana.status());
		

	}

}
