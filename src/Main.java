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
 * [ ] 4. Skriv ut kattens namn, ras och chipnummer vid upprop.
 *
 * [ ] 5. Visa ett tydligt meddelande om hotellet är tomt.
 *
 * [ ] 6. Dokumentera projektet i README.md.
 */

public class Main {
    public static void main(String[] args) {
    System.out.println("Välkommen till Djurhotellet!");
   

    KattHotell hotell = new KattHotell();

    hotell.ropaUppKatter();

    Katt katt1 = new Katt("Maja", "Bondkatt", 1001);
    Katt katt2 = new Katt("Sigge", "Norsk skogkatt", 1002);
    Katt katt3 = new Katt("Milo", "Bengal", 1001);

    //hotell.checkaIn(katt1);
    //hotell.checkaIn(katt2);
    //hotell.checkaIn(katt3);

    //System.out.println("Antal katter: " + hotell.antalKatter());

    }
}
