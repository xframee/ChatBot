package com.company;
import java.util.Scanner;
public class gætAlder {

    public static void alder() {
        Scanner minScanner = new Scanner(System.in);

        String lav = "lavere";
        String høj = "højere";
        String vundet = "ja";
        double min = 1.00;
        double max = 100.00;
        double mitGæt = (min + max - 1) / 2;
        mitGæt = Math.ceil(mitGæt);
        System.out.println("Er du " + mitGæt + " år gammel?");
        String brugerSvar = minScanner.nextLine();
        brugerSvar = brugerSvar.toLowerCase();

        while (!(brugerSvar).equals(vundet)) {

            if (brugerSvar.equals(lav)) {
                max = mitGæt - 1;
                mitGæt = (min + max - 1) / 2;
                mitGæt = Math.ceil(mitGæt);
                System.out.println("Er du " + mitGæt + " år gammel?");
                brugerSvar = minScanner.nextLine();
                brugerSvar = brugerSvar.toLowerCase();

            } else if ((brugerSvar).equals(høj)) {
                min = mitGæt + 1;
                mitGæt = (min + max - 1) / 2;
                mitGæt = Math.ceil(mitGæt);
                System.out.println("Er du " + mitGæt + " år gammel?");
                brugerSvar = minScanner.nextLine();
                brugerSvar = brugerSvar.toLowerCase();

            } else {
                System.out.println("Svar venligst med 'lavere' eller 'højere', eller 'ja'");
                brugerSvar = minScanner.nextLine();
                brugerSvar = brugerSvar.toLowerCase();

            }


        }
        System.out.println("Fedt, jeg gættede at du var " + mitGæt + " år gammel.");
    }

}
