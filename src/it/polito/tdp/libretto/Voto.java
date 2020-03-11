package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	
	private int punteggio;
	private String nomeCorso;
	private LocalDate data;
	
	public Voto(int voto, String nomeCorso, LocalDate data) {
		super();
		this.punteggio = voto;
		this.nomeCorso = nomeCorso;
		this.data = data;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(int voto) {
		this.punteggio = voto;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("Voto [voto=%s, nomeCorso=%s, data=%s]", punteggio, nomeCorso, data);
	}
	
}
