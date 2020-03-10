package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	
	private int voto;
	private String nomeCorso;
	private LocalDate data;
	
	public Voto(int voto, String nomeCorso, LocalDate data) {
		super();
		this.voto = voto;
		this.nomeCorso = nomeCorso;
		this.data = data;
	}
	
}
