package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	/*
	 * creare e inizializzare l’array contenente i nomi degli invitati
	 * chiedere all’utente come si chiama
	 * verificare che il nome sia presente nella lista lasciarlo entrare o rispedirlo cortesemente da dove è venuto*/
	
	public static void main(String[] args){
		
		//Creiamo l'array con i nomi degli invitati e le restanti variabili
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
				"Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        Scanner richiestaNome = new Scanner(System.in);

        //Chiediamo il nome all'utente
        System.out.println("Inserisci il tuo nome:");
        String nomeUtente = richiestaNome.nextLine();

        //Creiamo il ciclo for per controllare il valore di ogni invitato all'interno dell'array
        boolean trovato = false;
        for (int i = 0; i < listaInvitati.length; i++) {
            if (listaInvitati[i].equals(nomeUtente)) {
                trovato = true;
                break;
            }
        }

        if (trovato == true) {
            System.out.println("Benvenuto puoi entrare");
        } else {
            System.out.println("Tornatene da dove sei venuto!");
        }


	}
}
