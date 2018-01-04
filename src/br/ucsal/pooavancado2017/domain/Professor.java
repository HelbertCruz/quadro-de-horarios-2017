package br.ucsal.pooavancado2017.domain;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	public String nome;

	public List<Integer> restricao = new ArrayList<Integer>();

	public Professor(String nome, List<Integer> restricao2) {
		super();
		this.nome = nome;
		this.restricao = restricao2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Integer> getDiaRestricao() {
		return restricao;
	}

	public void setDiaRestricao(List<Integer> diaRestricao) {
		this.restricao = diaRestricao;
	}
}
