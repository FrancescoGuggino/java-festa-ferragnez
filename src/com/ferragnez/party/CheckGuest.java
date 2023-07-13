package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //creare e inizializzare l’array contenente i nomi degli invitati
        String[] guestList = {"Dua Lipa" , "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        //chiedere all’utente come si chiama
        String nameGuest;

        System.out.println("Inserisci il tuo nome e cognome: ");
        nameGuest = scan.nextLine();

        //verificare che il nome sia presente nella lista

        boolean checked = false;
       for (int i=0; i < guestList.length; i++) {


            if (guestList[i].equals(nameGuest)) {

               checked = true;
           }
       }

       if (checked) {
                System.out.println("Puoi entrare: " + nameGuest + "!");
            } else {
                System.out.println("Non puoi entrare: " + nameGuest + "!");
            }

/*
        boolean checked = false;
        int i = 0;
        while (!checked && i <guestList.length) {
            if (guestList[i].equals(nameGuest)) {
                checked = true;

            }
            i++;
        }

        //stampa

            if (checked) {
                System.out.println("Puoi entrare: " + nameGuest + "!");
            } else {
                System.out.println("Non puoi entrare: " + nameGuest + "!");
            }

 */

        scan.close();
    }
}
