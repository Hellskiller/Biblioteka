package biblioteka;

import java.util.LinkedList;

public class Knjiga {
	private String naslov;
	private long ISBN;
	private String izdavac;
	private int izdavanje;
	private LinkedList<Author> autori = new LinkedList();

	public Knjiga() {
	}

	public Knjiga(String naslov, long iSBN, String izdavac, int izdavanje) {
		this.naslov = naslov;
		ISBN = iSBN;
		this.izdavac = izdavac;
		this.izdavanje = izdavanje;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public int getIzdavanje() {
		return izdavanje;
	}

	public void setIzdavanje(int izdavanje) {
		this.izdavanje = izdavanje;
	}

	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", ISBN=" + ISBN + ", izdavac=" + izdavac + ", izdavanje=" + izdavanje
				+ "]";
	}

	public LinkedList<Author> getAutori() {
		return autori;
	}

	public void setAutori(LinkedList<Author> autori) {
		this.autori = autori;
	}

}
