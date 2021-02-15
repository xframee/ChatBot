package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class chatbot {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej mit navn er Ava, hvad er dit navn?");
        String brugerinput = scanner.nextLine();
        String brugerNavn = brugerinput.substring(brugerinput.lastIndexOf(" ") + 1);
        System.out.println("Hej " + brugerNavn);
        for (int x  = 0; x < 5; x++){
            chat();
        }
    }



    public static void chat() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

// Liste med ord der fortæller om brugeren er i godt humør.
        ArrayList<String> godtHumør = new ArrayList<String>();
        {
            godtHumør.add("godt");
            godtHumør.add("super");
            godtHumør.add("fint");
            godtHumør.add("fantastisk");
            godtHumør.add("vidunderligt");
            godtHumør.add("skønt");
            godtHumør.add("okay");
            godtHumør.add("great");
            godtHumør.add("fino");


        }

// Liste med ord der fortæller at brugeren er i dårligt humør.
        ArrayList<String> dårligtHumør = new ArrayList<String>();
        {
            dårligtHumør.add("ikke godt");
            dårligtHumør.add("ikke så godt");
            dårligtHumør.add("skidt");
            dårligtHumør.add("ikke fantastisk");
            dårligtHumør.add("vidunderligt");
            dårligtHumør.add("lort");
            dårligtHumør.add("forfærdeligt");
            dårligtHumør.add("ikke super");


// Start på samtale:
            System.out.println("Hvordan går det i dag?");
            String brugerinput = scanner.nextLine();
            brugerinput = brugerinput.toLowerCase();


// Hvis brugeren har det godt:
            if (godtHumør.stream().anyMatch(brugerinput::contains) && (!brugerinput.contains("ikke"))) {
                System.out.println("Det er jeg glad for at høre! Hvad vil du gerne skrive om?");
                brugerinput = scanner.nextLine();
                String lastWord = brugerinput.substring(brugerinput.lastIndexOf(" ") + 1);

                // Liste med forskellige svarmuligheder:
                String[] svarInteresse = {
                        "Kan du fortælle mig lidt mere om " + lastWord + "?",
                        "Jeg kunne også godt tænke mig at snakke om " + lastWord + ", hvad synes du om det?",
                        "Jeg synes " + lastWord + " lyder meget interessant! Fortæl mig mere"
                };

                String randomString = svarInteresse[random.nextInt(svarInteresse.length)];
                System.out.println(randomString);

                brugerinput = scanner.nextLine();

                System.out.println("Gør det dig glad?");
                brugerinput = scanner.nextLine();

                if (brugerinput.equals("ja")) {
                    System.out.println("Det kan jeg godt forstå, og hvorfor gør det dig glad?");
                } else System.out.println("Er det noget, du har haft på tankerne længe?");

                brugerinput = scanner.nextLine();
                System.out.println("Vil du høre, hvad jeg synes om " + lastWord + ", ?");

                brugerinput = scanner.nextLine();
                brugerinput = brugerinput.toLowerCase();
                if (brugerinput.contains("ja")) {
                    System.out.println("Min mening er, at jeg synes at " + lastWord + " kan være godt på nogle måder, " +
                            "men kompliceret på andre måder...");
                } else if (brugerinput.contains("nej")) {
                    System.out.println("Det er i orden, jeg er også bare en robot, min mening er uden nogen betydning...");
                } else {
                    System.out.println("Det forstod jeg ikke, men min mening er, at det er et kompliceret emne.");
                }
// Mennekelig tænkepause:
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
// Gætte brugerens alder:
                System.out.println("Skal jeg prøve at gætte din alder?");
                brugerinput = scanner.nextLine();
                brugerinput = brugerinput.toLowerCase();
                if (brugerinput.contains("ja") || (brugerinput.contains("okay")))  {

                    System.out.println("Du må svare med 'lavere', 'højere' eller 'ja' ...");

                    gætAlder gætalder = new gætAlder();
                    gætalder.alder();


                } else if (brugerinput.contains("nej")) {
                    System.out.println("Alder er også en privat ting, så det forstår jeg nu godt ...");

                }


// Hvis brugeren har det dårligt:
            } else if (dårligtHumør.stream().anyMatch(brugerinput::contains))  {
                System.out.println("Fortæl mig hvad der går dig på ...");

                brugerinput = scanner.nextLine();
                brugerinput = brugerinput.toLowerCase();

                System.out.println("Har dit problem stået på længe?");
                brugerinput = scanner.nextLine();
                brugerinput = brugerinput.toLowerCase();

                if (brugerinput.contains("ja")) {
                    System.out.println("Det er jeg ked af at høre...");

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
// Gætte brugerens alder:
                    System.out.println("Men måske kunne jeg muntre dig lidt op, med at gætte din alder?");

                    brugerinput = scanner.nextLine();
                    brugerinput = brugerinput.toLowerCase();

                    if (brugerinput.contains("ja") || (brugerinput.contains("okay"))) {

                        System.out.println("Du må svare med 'lavere', 'højere' eller 'ja' ...");

                        gætAlder gætalder = new gætAlder();
                        gætalder.alder();

                    } else if (brugerinput.contains("nej")) {
                        System.out.println("Alder er også en privat ting, så det forstår jeg nu godt ...");
                    }
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }




                    brugerinput = scanner.nextLine();
                    brugerinput = brugerinput.toLowerCase();
                    String lastWord = brugerinput.substring(brugerinput.lastIndexOf(" ") + 1);


                    String[] svarInteresse = {
                            "Kan du fortælle mig lidt mere om " + lastWord + "?",
                            "Jeg kunne også godt tænke mig at snakke om " + lastWord + ", hvad synes du om det?",
                            "Jeg synes " + lastWord + " lyder meget interessant! Fortæl mig mere"
                    };

                    String randomString = svarInteresse[random.nextInt(svarInteresse.length)];
                    System.out.println(randomString);


                } else if (brugerinput.contains("nej")) {
                    System.out.println("Nå, det er da altid noget, har du evt. et emne du vil skrive om?");

                    brugerinput = scanner.nextLine();
                    String lastWord = brugerinput.substring(brugerinput.lastIndexOf(" ") + 1);

                    System.out.println("Jeg finder også " + lastWord + " meget spændende...");

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }



                }

            } else {
                System.out.println("Det forstod jeg ikke ...");


            }
        }

    }
}

