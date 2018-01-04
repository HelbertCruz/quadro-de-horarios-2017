package br.ucsal.pooavancado2017.domain;

import br.ucsal.pooavancado2017.enums.Duracao;

public class Disciplina {

	public String nome;

	public int semestre;

	public Duracao duracao;

	public Disciplina(String nome, int semestre, Duracao duracao) {
		super();
		this.nome = nome;
		this.semestre = semestre;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public Duracao getDuracao() {
		return duracao;
	}

	public void setDuracao(Duracao duracao) {
		this.duracao = duracao;
	}

	/*
	 * private String gerarMat() { Calendar cal = Calendar.getInstance(); String ano
	 * = cal.get(Calendar.YEAR); String matricula = new
	 * String(cal.get(Calendar.YEAR)); return matricula; }
	 */
}
