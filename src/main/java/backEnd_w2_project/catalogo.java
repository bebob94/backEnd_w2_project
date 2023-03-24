package backEnd_w2_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class catalogo {
	List<archivio> myCatalogo = new ArrayList<archivio>();
	Scanner scan = new Scanner(System.in);
	
	public void aggiungiElemento(archivio archivio) {
		this.myCatalogo.add(archivio);

	}

	public String toString() {
		return  this.myCatalogo+ "\n";
	}
	
	public void deleteForISBN() {
		int myIsbn;
		System.out.println("inserisci l'ISBN dell'elemento da eliminare: ");
		myIsbn= scan.nextInt();
		scan.nextLine();
        List<archivio> nuovoCatalogo= myCatalogo.stream().filter(x->!x.ISBN.equals(myIsbn)).collect(Collectors.toList())    ;

        myCatalogo= nuovoCatalogo;
    }
	
	public void searchForISBN() {
		int myIsbn;
		System.out.println("inserisci l'ISBN dell'elemento da cercare: ");
		myIsbn= scan.nextInt();
		scan.nextLine();
		List<archivio> nuovoCatalogo= myCatalogo.stream().filter(x->x.ISBN.equals(myIsbn)).collect(Collectors.toList())    ;
		
		System.out.println(nuovoCatalogo);
	}
	
	public void searchForAnno() {
		int myYear;
		System.out.println("\ninserisci l'anno dell'elemento da cercare: ");
		myYear= scan.nextInt();
		scan.nextLine();
		List<archivio> nuovoCatalogo= myCatalogo.stream().filter(x->x.anno.equals(myYear)).collect(Collectors.toList())    ;
		
		System.out.println(nuovoCatalogo);
	}
	
	public void searchForAutore() {
		String myAutore;
		System.out.println("\ninserisci l'Autore dell'elemento da cercare: ");
		myAutore= scan.nextLine();
		List<archivio> nuovoCatalogo = myCatalogo.stream()
		        .filter(x -> x instanceof books) 
		        .map(x -> (books) x) 
		        .filter(x -> x.autore.equals(myAutore)) 
		        .collect(Collectors.toList());
		    System.out.println(nuovoCatalogo);
		System.out.println(nuovoCatalogo);
	}
	
	
	
}
