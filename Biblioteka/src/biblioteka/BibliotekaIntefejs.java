package biblioteka;

import java.util.LinkedList;

public interface BibliotekaIntefejs {
	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov);
	
	public void ucitajIzFajla(String naziv);
	public void sacuvajUFajl(String naziv);
}
