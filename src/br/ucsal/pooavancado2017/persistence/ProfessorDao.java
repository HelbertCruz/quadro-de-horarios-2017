package br.ucsal.pooavancado2017.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.ucsal.pooavancado2017.domain.Professor;

public class ProfessorDao {

	public static Professor cadastrarProfessor() {
		String nome = JOptionPane.showInputDialog("Digite o nome do professor:");
		List<Integer> restricao = diasEHorariosRestritos();
		Professor professor = new Professor(nome, restricao);
		return professor;
	}

	private static List<Integer> diasEHorariosRestritos() {
		List<Integer> restricoes = new ArrayList<>();
		int resultado;
		do {
			String dia = JOptionPane
					.showInputDialog("Digite o n�mero referente ao dia que o professor n�o pode dar aula:\n"
							+ "\n1. Segunda-Feira.\n" + "2. Ter�a-Feira.\n" + "3. Quarta-Feira.\n"
							+ "4. Quinta-Feira.\n" + "5. Sexta-Feira.\n" + "6. S�bado.");
			dia += JOptionPane
					.showInputDialog("Digite o n�mero referente ao hor�rio que o professor n�o pode dar aula.\n\n"
							+ "De segunda a sexta:\n" + "0. Para ambos os hor�rios\n" + "1. 19:00 - 20:15\n"
							+ "2. 20:25 - 21:40\n" + "\nS�bado:\n" + "0. Para todos os hor�rios\n"
							+ "1. 07:00 - 08:15\n" + "2. 08:25 - 09:40\n" + "3. 09:50 - 11:05");
			restricoes.add(Integer.parseInt(dia));
			resultado = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro dia ou hor�rio?");
		} while (resultado == JOptionPane.YES_OPTION);
		return restricoes;

	}
}
