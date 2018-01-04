package br.ucsal.pooavancado2017.persistence;

import javax.swing.JOptionPane;

import br.ucsal.pooavancado2017.domain.Disciplina;
import br.ucsal.pooavancado2017.enums.Duracao;

public class DisciplinaDao {

	public static Disciplina cadastrarDisciplina() {

		String nome = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
		int semestre = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a qual semestre essa disciplina pertence:"));
		Duracao duracao = (Duracao) definirDuracao();
		Disciplina disciplina = new Disciplina(nome, semestre, duracao);

		return disciplina;

	}

	private static Duracao definirDuracao() {
		String pegarEnum = JOptionPane.showInputDialog("Digite a carga horária: 30, 60 ou 90.");
		Duracao duracao = Duracao.valueOfHora(pegarEnum);
		return duracao;
	}
}
