 package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto> voti;
	
	public Libretto() {
		this.voti=new ArrayList <Voto>();
	}
	
	public void addVoto(Voto v) {
		voti.add(v);
	}
	
	public List <Voto> cercaVoti(int voto){
		List <Voto> result=new ArrayList <Voto>();
		for(Voto v:this.voti)
			if(v.getPunteggio()==voto)
				result.add(v);
		return result;
	}
	
	public Voto cercaEsame(String esame){
		for(Voto v:this.voti)
			if(v.getNomeCorso().equals(esame))
				return v;
		return null;
	}
	
}
