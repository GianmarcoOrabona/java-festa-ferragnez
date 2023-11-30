package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creo l'array di invitati
        String[] invitati  = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Paradis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // Chiedo all'utente come si chiama
        System.out.println("Come ti chiami? ");
        String userName = scanner.nextLine();

        // Creo una flag che mi serve per vedere se l'utente è stato trovato
        boolean found = false;

        // Ciclo all'interno dell'array per controllare se il nome è presente
        for (int i = 0; i < invitati.length; i++) {

            // Confronto il nome da cercare con l'elemento corrente
            if (userName.equals(invitati[i])) {
                found = true;
            }
        }

        // Alla fine del ciclo for guardo il valore della variabile found
        if (!found) {
            System.out.println("Eh, volevi! Non puoi entrare");
        } else {
            System.out.println("Prego, puoi entrare");
        }
    }
}
