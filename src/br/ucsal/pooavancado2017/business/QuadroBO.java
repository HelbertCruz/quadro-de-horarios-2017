package br.ucsal.pooavancado2017.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import br.ucsal.pooavancado2017.domain.Aula;
import br.ucsal.pooavancado2017.domain.Disciplina;
import br.ucsal.pooavancado2017.domain.Professor;
import br.ucsal.pooavancado2017.persistence.DisciplinaDao;
import br.ucsal.pooavancado2017.persistence.ProfessorDao;

public class QuadroBO {

	private static List<Aula> semestres = new ArrayList<Aula>();
	private static List<Aula> aulas = new ArrayList<Aula>();
	private static List<Aula> primeiro = new ArrayList<Aula>();
	private static List<Aula> segundo = new ArrayList<Aula>();
	private static List<Aula> terceiro = new ArrayList<Aula>();
	private static List<Aula> quarto = new ArrayList<Aula>();
	private static List<Aula> quinto = new ArrayList<Aula>();

	private static Aula[] segunda = new Aula[10];
	private static Aula[] terca = new Aula[10];
	private static Aula[] quarta = new Aula[10];
	private static Aula[] quinta = new Aula[10];
	private static Aula[] sexta = new Aula[10];;
	private static Aula[] sabado = new Aula[15];

	private static Aula criarAula() {
		int resultado;
		Aula aula;
		do {

			Professor professor = ProfessorDao.cadastrarProfessor();
			Disciplina disciplina = DisciplinaDao.cadastrarDisciplina();
			aula = new Aula(disciplina, professor);

			resultado = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra aula?");

		} while (resultado == JOptionPane.YES_OPTION);
		return aula;
	}

	public void criarGrade() {
		semestres.add(QuadroBO.criarAula());

		for (Aula aula : semestres) {
			if (aula.disciplina.getSemestre() == 1) {
				primeiro.add(aula);
			} else if ((aula.disciplina.getSemestre() == 2)) {
				segundo.add(aula);
			} else if (aula.disciplina.getSemestre() == 3) {
				terceiro.add(aula);
			} else if (aula.disciplina.getSemestre() == 4) {
				quarto.add(aula);
			} else if (aula.disciplina.getSemestre() == 5) {
				quinto.add(aula);
			}
		}

		Aula aula;

		for (int i = 0; i < primeiro.size(); i++) {
			aula = primeiro.get(i);
			if ((!aula.professor.getDiaRestricao().contains(10)) || (!aula.professor.getDiaRestricao().contains(11)
					|| (!aula.professor.getDiaRestricao().contains(12)))) {

				if (aula.disciplina.getDuracao().equals("CURTA")) {

				}
			}
		}
	}

	public static void imprimir() {
		QuadroBO.criarAula();
		// Map<Aula, Aula> dias = new HashMap<Aula, Aula>();

		System.out.println("1º semestre:");
		System.out.println("Segunda:");
		System.out.println("Disciplina: " + primeiro.get(0).disciplina.getNome() + " Professor: "
				+ primeiro.get(0).professor.getNome());
		System.out.println("Disciplina: " + primeiro.get(1).disciplina.getNome() + " Professor: "
				+ primeiro.get(1).professor.getNome());
	}
}
