package it.polito.tdp.libretto;

import java.time.LocalDate;

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

	}

}
