package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto libr=new Libretto();
		
		libr.addVoto(new Voto(30,"Analisi I",LocalDate.of(2017, 1, 15)));
		libr.addVoto(new Voto(21,"Analisi II",LocalDate.of(2018, 1, 15)));
		libr.addVoto(new Voto(25,"Fisica I",LocalDate.of(2017, 6, 10)));
		libr.addVoto(new Voto(28,"Fisica II",LocalDate.of(2018, 9, 3)));
		libr.addVoto(new Voto(18,"Geometria",LocalDate.of(2017, 9, 1)));
		libr.addVoto(new Voto(20,"Economia",LocalDate.of(2018, 1, 28)));
		libr.addVoto(new Voto(25,"Ricerca operativa",LocalDate.of(2018, 6, 5)));
		libr.addVoto(new Voto(24,"Complementi di ecomnomia",LocalDate.of(2018, 2, 15)));
		libr.addVoto(new Voto(25,"Logistica",LocalDate.of(2019, 2, 1)));
		libr.addVoto(new Voto(27,"Programmazione a oggetti",LocalDate.of(2019, 1, 25)));
		
		List <Voto> votiVenticinque=libr.cercaVoti(25);
		System.out.println(votiVenticinque);
		
		Voto v1=libr.cercaEsame("Geometria");
		Voto v2=libr.cercaEsame("Analisi III");
		System.out.println(v1+"\n"+v2);
		
		Voto giusto=new Voto(18,"Geometria",LocalDate.now());
		Voto sbagliato=new Voto(28,"Geometria",LocalDate.now());
		Voto mancante=new Voto(30,"Merendine",LocalDate.now());
		
		System.out.println("Il voto "+giusto.toString()+" è "+libr.esisteGiaVoto(giusto));
		System.out.println("Il voto "+sbagliato.toString()+" è "+libr.esisteGiaVoto(sbagliato));
		System.out.println("Il voto "+mancante.toString()+" è "+libr.esisteGiaVoto(mancante));
		
		System.out.println("Il voto "+giusto.toString()+" è in conflitto "+libr.votoInConflitto(giusto));
		System.out.println("Il voto "+sbagliato.toString()+" è in conflitto "+libr.votoInConflitto(sbagliato));
		System.out.println("Il voto "+mancante.toString()+" è in conflitto "+libr.votoInConflitto(mancante));
		
		System.out.println(libr.addVoto(giusto));
		System.out.println(libr.addVoto(sbagliato));
		System.out.println(libr.addVoto(mancante));
		System.out.println(libr.toString());
		
	}

}
