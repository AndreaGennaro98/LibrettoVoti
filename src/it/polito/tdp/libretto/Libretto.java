 package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto> voti;
	
	public Libretto() {
		this.voti=new ArrayList <Voto>();
	}
	
	public boolean addVoto(Voto v) {
		boolean esistegiavoto=this.esisteGiaVoto(v);
		boolean einconflitto=this.votoInConflitto(v);
		if(esistegiavoto==false && einconflitto==false) {
			voti.add(v);
			return true;
		}
		else
			return false;
	}
	
	public List <Voto> cercaVoti(int voto){
		List <Voto> result=new ArrayList <Voto>();
		for(Voto v:this.voti)
			if(v.getPunteggio()==voto)
				result.add(v);
		return result;
	}
	
	public Voto cercaEsame(String esame){
		/*for(Voto v:this.voti)
			if(v.getNomeCorso().equals(esame))
				return v;*/
		int pos=this.voti.indexOf(new Voto(1,esame,null));
		if(pos==-1)
			return null;
		else
			return voti.get(pos);
	}
	
	public boolean esisteGiaVoto(Voto v) {
		
		int pos=this.voti.indexOf(v);
		if(pos==-1)
			return false;
		else {
			return v.getPunteggio()==this.voti.get(pos).getPunteggio();
		}
		/*Voto trovato=this.cercaEsame(v.getNomeCorso());
		if(trovato==null)
			return false;
		else {
			if(trovato.getPunteggio()==v.getPunteggio())
				return true;
			else
				return false;
		}*/
	}
	
	public boolean votoInConflitto(Voto v) {

		int pos=this.voti.indexOf(v);
		if(pos==-1)
			return false;
		else {
			return v.getPunteggio()!=this.voti.get(pos).getPunteggio();
		}//Il voto esiste e ha un punteggio diverso
	}
	
	public String toString() {
		return this.voti.toString();
	}
	
}
