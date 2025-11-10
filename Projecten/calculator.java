// Voegt de scanner library toe
import java.util.Scanner;
//Dit gedeelte staat bij elk java bestandje, waarom... Tja dat moet gewoon ofzo
public class calculator {
    public static void main(String[] args){
// Hier geven we de Scanner library een naam denk ik
// Ik heb ook maar een tutorial gevolgt over user input (shoutout naar Bro Code)
        Scanner scanner = new Scanner(System.in);

// Hier vraagt de code om het eerste getal.
// Tip: typ geen System.out.println(); maar typ sout en klik dan op enter.
        System.out.println("Voer getal 1 in: ");
        // een integer is een variable, wat hier wordt gedaan is het zegt eigenlijk
        // het integer getal1 is wat de gebruiker zo intypt.
        int getal1 = scanner.nextInt();

// hier vraagt de code om een bewerking
        System.out.println("Voer de bewerking in, kies een getal");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. x");
        System.out.println("1. :");
        //en maakt de integer bewerking aan
        int bewerking = scanner.nextInt();

        // en getal 2
        System.out.println("Voer getal 2 in: ");
        int getal2 = scanner.nextInt();

// switch wordt gebruikt om te checken op verschillende situaties.
        switch (bewerking) {
            // je kan het zien als "In the case of ... then ..."
            case 1:
                System.out.println(getal1 + getal2);
                // gebruik in een case altijd een break, anders blijft hij checken voor case 1 en niet de anderen.
                break;
            case 2:
                System.out.println(getal1 - getal2);
                break;
            case 3:
                System.out.println(getal1 * getal2);
                break;
            case 4:
                System.out.println(getal1 / getal2);
                break;
                // als het iets anders is moeten we iets maken dat daarvoor checkt, dus we gebruiken "default:"
            default:
                System.out.println("Voer een geldig getal in");
                break;
        }
// als je de scanner library gebruikt moet je scanner.close(); neerzetten om de scanner te stoppen.
        scanner.close();
    }
}
