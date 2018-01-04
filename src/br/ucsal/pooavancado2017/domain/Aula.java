package br.ucsal.pooavancado2017.domain;

public class Aula {

	public Disciplina disciplina;
	
	public Professor professor;

	public Aula(Disciplina disciplina, Professor professor) {
		super();
		this.disciplina = disciplina;
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
