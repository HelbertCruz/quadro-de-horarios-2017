package br.ucsal.pooavancado2017.enums;

public enum Duracao {
	CURTA("30"), MEDIA("60"), LONGA("90");

	private String hora;

	private Duracao(String hora) {
		this.hora = hora;
	}

	public String getHora() {
		return hora;
	}

	public static Duracao valueOfHora(String hora) {
		for (Duracao duracao : values()) {
			if (duracao.getHora().equalsIgnoreCase(hora)) {
				return duracao;
			}
		}
		throw new IllegalArgumentException();
	}
}
