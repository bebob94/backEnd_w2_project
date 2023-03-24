package backEnd_w2_project;

import java.io.IOException;

public class Runnable {

	
	public static void main(String[] args) {

		//<<<<<<<<<<<<<<<<<<<INIZIO CREAZIONE DEI BOOKS E DEI MAGAZINE>>>>>>>>>>>>>>>>>>>
		books book0 = new books("Marcel Proust", my_genere.AUTOBIOGRAFIA,1234,150,2010,"Alla ricerca del tempo perduto");
		books book1 = new books("Fëdor Dostoevskij", my_genere.AVVENTURA_E_AZIONE,12345,250,1950,"I fratelli Karamazov ");
		books book2 = new books("Gustave Flaubert", my_genere.BIOGRAFIA,12346,350,2005,"Madame Bovary");
		books book3 = new books("Franz Kafka", my_genere.DISTOPIA,12347,530,1950,"Il processo");
		books book4 = new books("Miguel de Cervantes", my_genere.EROTICO,12348,320,1989,"Don Chisciotte della Mancia");
		books book5 = new books("Thomas Mann", my_genere.FANTASCIENZA,12349,520,1967,"La montagna incantata ");
		books book6 = new books("Lev Tolstoj", my_genere.FANTASY,123412,540,2012,"Guerra e pace");
		books book7 = new books("Jonathan Franzen", my_genere.HORROR,1234342,550,1994,"Le correzioni");
		books book8 = new books("Forster Wallace", my_genere.IL_GIALLO,1233424,250,1966,"Infinite jest");
		books book9 = new books("Gabriel Garcia Marquez", my_genere.ROMANZO_DI_FORMAZIONE,1232344,250,2020,"Cent’anni di solitudine");
		books book10 = new books("Herman Melville", my_genere.ROMANZO_STORICO,12334324,150,2010,"Moby Dick");

		
		magazine magazine0 = new magazine(my_magazine.MENSILE,125435334,50,2010,"nomi");
		magazine magazine1 = new magazine(my_magazine.MENSILE,1234534,30,2023,"di");
		magazine magazine2 = new magazine(my_magazine.MENSILE,123434,46,2012,"giornali");
		magazine magazine3 = new magazine(my_magazine.SEMESTRALE,1343234,134,1920,"non");
		magazine magazine4 = new magazine(my_magazine.SEMESTRALE,12234,47,1340,"ne");
		magazine magazine5 = new magazine(my_magazine.SEMESTRALE,1221234,12,1900,"conosco");
		magazine magazine6 = new magazine(my_magazine.SEMESTRALE,123434,54,1987,"purtroppo");
		magazine magazine7 = new magazine(my_magazine.SETTIMANALE,13432234,10,2001,"non");
		magazine magazine8 = new magazine(my_magazine.SETTIMANALE,1223434,53,1934,"so");
		magazine magazine9 = new magazine(my_magazine.SETTIMANALE,1223434,8,2018,"cosa");
		magazine magazine10 = new magazine(my_magazine.SETTIMANALE,12324234,45,2003,"mettere");
		//<<<<<<<<<<<<<<<<<<<FINE CREAZIONE DEI BOOKS E DEI MAGAZINE>>>>>>>>>>>>>>>>>>>
		
		//<<<<<<<<<<<<<<<<<<<INIZIO CREAZIONE E POPOLAMENTO DELL'ARRAYLIST>>>>>>>>>>>>>>>>>>>
		catalogo myCatalogo = new catalogo();
		
		myCatalogo.aggiungiElemento(book0);
		myCatalogo.aggiungiElemento(book1);
		myCatalogo.aggiungiElemento(book2);
		myCatalogo.aggiungiElemento(book3);
		myCatalogo.aggiungiElemento(book4);
		
		myCatalogo.aggiungiElemento(magazine0);
		myCatalogo.aggiungiElemento(magazine1);
		myCatalogo.aggiungiElemento(magazine2);
		myCatalogo.aggiungiElemento(magazine3);
		myCatalogo.aggiungiElemento(magazine4);
		
		System.out.println(myCatalogo);
		//<<<<<<<<<<<<<<<<<<<INIZIO CREAZIONE E POPOLAMENTO DELL'ARRAYLIST>>>>>>>>>>>>>>>>>>>
		
		//<<<<<<<<<<<<<<<<<<<METODO CHE ELIMINA UN ELEMENTO CERCATO PER ID>>>>>>>>>>>>>>>>>>>
		myCatalogo.deleteForISBN();
		System.out.println(myCatalogo);
		
		//<<<<<<<<<<<<<<<<<<<METODO CHE CERCA UN ELEMENTOPER ID>>>>>>>>>>>>>>>>>>>
		myCatalogo.searchForISBN();
		
		//<<<<<<<<<<<<<<<<<<<METODO CHE CERCA UN ELEMENTO PER ANNO>>>>>>>>>>>>>>>>>>>		
		myCatalogo.searchForAnno();
		
		//<<<<<<<<<<<<<<<<<<<METODO CHE CERCA UN ELEMENTO PER AUTORE>>>>>>>>>>>>>>>>>>>
		myCatalogo.searchForAutore();
		
		//<<<<<<<<<<<<<<<<<<<METODO CHE CREA UN FILE NEL DISCO CON I DATI DEL CATALOGO>>>>>>>>>>>>>>>>>>>
		   try {
			catalogo.saveToFile(myCatalogo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		 //<<<<<<<<<<<<<<<<<<<METODO CHE CARICA UN FILE DAL DISCO>>>>>>>>>>>>>>>>>>>   
		 try {
			catalogo.loadFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
