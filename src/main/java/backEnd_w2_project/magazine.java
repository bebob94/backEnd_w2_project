package backEnd_w2_project;

public class magazine extends archivio {
	
    Enum<my_magazine> publicazione;

    public magazine(Enum<my_magazine> publicazione, int isbn, int npagine, int anno, String titolo) {
        super(isbn, npagine, anno, titolo);
        this.publicazione = publicazione;
    }

    public String toString() {
        return "\n"+"\nMAGAZINE "+"\nTitolo: " + this.titolo + "\nPubblicazione: " + this.publicazione + "\nNumero pagine: " + this.nPagine + "\nAnno: " + this.anno + "\nISBN: " + this.ISBN;
    }
}