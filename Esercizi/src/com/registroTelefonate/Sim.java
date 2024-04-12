package com.registroTelefonate;
/*
 * metodi
 * aggiungi telefonata fatta
 * aggiungi telefonata ricevuta
 * costo totale chiamate
 * durata totale chiamate
 */
import com.Telefonata;

public class Sim {

	private int numero;
	private int  importo;
	
	//elenco ultime 10 telefonate fatte
	private Telefonata[] telefonateFatte = new Telefonata[10];
	//elenco ultime 10 telefonate ricevute
	private Telefonata[] telefonateRicevute = new Telefonata[10];
	
	public void aggiungiTelefonataFatta(Telefonata f) {
		//la telefonata più recente sarà in posizione 0
		// a mano a mano che aggiungo una telefonata le altre saranno spostate di una posizione
		for(int i = telefonateFatte.length - 2; i>=0; i--) {
			telefonateFatte[i+1]=telefonateFatte[i];
		}
		telefonateFatte[0]=f;
		
	}
	
	public void aggiungiTelefonataRicevuta(Telefonata f) {
		//la telefonata più recente sarà in posizione 0
		// a mano a mano che aggiungo una telefonata le altre saranno spostate di una posizione
		for(int i = telefonateRicevute.length - 2; i>=0; i--) {
			telefonateRicevute[i+1]=telefonateRicevute[i];
		}
		telefonateFatte[0]=f;
		
	}
	
	public void stampaTelefonateFatte() {
		System.out.println("ELENCO TELEFONATE FATTE \n");
		for (int i = 0; i < telefonateFatte.length; i++) {
			if(telefonateFatte[i] != null)
				System.out.println("Telefonata n° " + telefonateFatte[i].getNumero());
		}
	}
	
	public void stampaTelefonateRicevute() {
		System.out.println("ELENCO TELEFONATE RICEVUTE \n");
		for (int i = 0; i < telefonateRicevute.length; i++) {
			if(telefonateRicevute[i] != null)
				System.out.println(telefonateRicevute[i].getNumero());
		}
	}
	
	public void costoTotaleTelefonate() {
		int costoTotale = 0;
		for (int i = telefonateFatte.length - 2; i>=0; i--){
			costoTotale += telefonateFatte[i].getCosto();
		}
		System.out.println("Il costo totale è: " + costoTotale);
		
	}
	
	public void durataTotaleTelefonate() {
		int durataTotale = 0;
		for (int i = telefonateFatte.length - 2; i>=0; i--){
			durataTotale += telefonateFatte[i].getDurata();
		}
		System.out.println("La durata totale è: " + durataTotale);
		
	}
	
	
	public static void main(String[] args) {
		
		Sim s = new Sim();
		for (int i = 0; i < 11; i++) {
			Telefonata t = new Telefonata();
			t.setNumero(i);
			t.setDurata(i);
			t.setCosto(i);
			s.aggiungiTelefonataFatta(t);
		}
		
		for (int i = 0; i < 11; i++) {
			Telefonata t = new Telefonata();
			t.setNumero(i);
			t.setDurata(i);
			t.setCosto(i);
			s.aggiungiTelefonataRicevuta(t);
		}
		
		
		s.stampaTelefonateFatte();
		s.stampaTelefonateRicevute();
		s.costoTotaleTelefonate();
		s.durataTotaleTelefonate();
	}
}



