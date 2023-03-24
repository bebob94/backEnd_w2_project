package backEnd_w2_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
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
		System.out.println("inserisci l'ISBN dell'elemento da eliminare:\n");
		myIsbn= scan.nextInt();
		scan.nextLine();
        List<archivio> nuovoCatalogo= myCatalogo.stream().filter(x->!x.ISBN.equals(myIsbn)).collect(Collectors.toList())    ;

        myCatalogo= nuovoCatalogo;
    }
	
	public void searchForISBN() {
		int myIsbn;
		System.out.println("inserisci l'ISBN dell'elemento da cercare:\n");
		myIsbn= scan.nextInt();
		scan.nextLine();
		List<archivio> nuovoCatalogo= myCatalogo.stream().filter(x->x.ISBN.equals(myIsbn)).collect(Collectors.toList())    ;
		
		System.out.println(nuovoCatalogo + "\n");
	}
	
	public void searchForAnno() {
		int myYear;
		System.out.println("\ninserisci l'anno dell'elemento da cercare:\n");
		myYear= scan.nextInt();
		scan.nextLine();
		List<archivio> nuovoCatalogo= myCatalogo.stream()
				.filter(x->x.anno.equals(myYear))
				.collect(Collectors.toList())    ;
		
		System.out.println(nuovoCatalogo+ "\n");
	}
	
	public void searchForAutore() {
		String myAutore;
		System.out.println("\ninserisci l'Autore dell'elemento da cercare:\n");
		myAutore= scan.nextLine();
		List<archivio> nuovoCatalogo = myCatalogo.stream()
		        .filter(x -> x instanceof books) 
		        .map(x -> (books) x) 
		        .filter(x -> x.autore.equals(myAutore)) 
		        .collect(Collectors.toList());
		    System.out.println(nuovoCatalogo+ "\n");
	}
	
	public static void saveToFile(catalogo catalogo) throws IOException  {
	   File file1 = new File("catalogo.txt");
	   FileWriter myFile = new FileWriter(file1);
	   PrintWriter newFile = new PrintWriter(myFile);
	   newFile.print(catalogo);
	   newFile.close();
	}
	
public static void loadFromFile() throws IOException {
	File file1 = new File("catalogo.txt");
	String readString= FileUtils.readFileToString(file1,"UTF-8");
	System.out.println(readString);
}
	
}
