/*
 * Att-göra-lista – Djurhotellet Tass & Mys
 *
 * [x] 1. Skapa klassen Katt med namn, ras och chipnummer.
 * Uppgifterna ska inte kunna ändras efter att katten skapats.
 *
 * [x] 2. Skapa klassen KattHotell med en privat lista av katter.
 *
 * [x] 3. Hindra att två katter med samma chipnummer checkas in.
 * Visa en varning om chipnumret redan finns.
 * Räkna antalet incheckade katter.
 *
 * [x] 4. Skriv ut kattens namn, ras och chipnummer vid upprop.
 *
 * [x] 5. Visa ett tydligt meddelande om hotellet är tomt.
 *
 * [x] 6. Dokumentera projektet i README.md.
 * 
 * [x] 7. Göra så att hotellet kan leta upp en katt på namn 
 * (eller svara tomt om den saknas).
 * 
 * [x] 8. Bygga meny-loopen
 * 
 * [x] 9. Koppla ihop val 1-4 (med grindvakt i val 3).

*/

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    System.out.println("Välkommen till Djurhotellet!");
   
    Scanner scanner = new Scanner(System.in);
    KattHotell hotell = new KattHotell();

    int val = 0;

    while (val !=4) {
        System.out.println("\n=== Tass & Mys ===");
        System.out.println("1. Checka in katt");
        System.out.println("2. Lista alla incheckade katter");
        System.out.println("3. Leta upp katt på namn");
        System.out.println("4. Avsluta programmet");
        System.out.print("Välj ett alternativ (1-4): ");
        
        val = scanner.nextInt();
        scanner.nextLine(); // Rensa scanner

        switch (val) {
            case 1:
                System.out.print("Ange kattens namn: ");
                String namn = scanner.nextLine();
                
                System.out.print("Ange kattens ras: ");
                String ras = scanner.nextLine();
                
                System.out.print("Ange kattens chipnummer: ");
                int chipnummer = scanner.nextInt();
                
                Katt nyKatt = new Katt(namn, ras, chipnummer);

                if (hotell.checkaIn(nyKatt)) {
                    System.out.println("Katten " + namn + " har checkats in.");
                }
                break;

            case 2:
                hotell.ropaUppKatter();
                
                break;
            
                case 3:
                System.out.print("Ange kattens namn att leta upp: ");
                String sokNamn = scanner.nextLine();
                
                List<Katt> hittadeKatter = hotell.hittaNamn(sokNamn);

                if (!hittadeKatter.isEmpty()) {
                    System.out.println("Katt hittad!");
                    for (Katt katt : hittadeKatter) {
                        System.out.println("Namn: " + katt.getNamn() );
                        System.out.println(", Ras: " + katt.getRas() );
                        System.out.println(", Chipnummer: " + katt.getChipnummer());
                    }
                } 
                
                else {
                    System.out.println("Ingen katt med namnet " + sokNamn + " hittades.");
                }
                break;

            case 4:
                System.out.println("Avslutar programmet.");
                break;

            default:
                System.out.println("Ogiltigt val. Försök igen.");
        }
    }

    scanner.close();

    //Katt katt1 = new Katt("Maja", "Bondkatt", 1001);
    //Katt katt2 = new Katt("Sigge", "Norsk skogkatt", 1002);
    //Katt katt3 = new Katt("Milo", "Bengal", 1001);

    //hotell.checkaIn(katt1);
    //hotell.checkaIn(katt2);
    //hotell.checkaIn(katt3);

    System.out.println("Antal katter: " + hotell.antalKatter());
    
    hotell.ropaUppKatter();

    }
}
