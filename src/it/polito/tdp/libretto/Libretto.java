 package it.polito.tdp.libretto;

import java.time.LocalDate;
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
			if(v.getPunteggio()==this.voti.get(pos).getPunteggio())
				return true;
			else
				return false;
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
	
}
