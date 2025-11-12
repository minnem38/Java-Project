// Als je de calculator snapt, snap je deze code waarschijnlijk ook wel. Dus ik he geen comments met uitleg toegevoegd
import java.util.Scanner;

public class GeldOmzetter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kies een geldtype dat je wilt omzetten:");
        System.out.println("1. Euro");
        System.out.println("2. Dollar");
        System.out.println("3. Pond");
        int GeldIn = scanner.nextInt();

        System.out.println("Typ in hoeveel je wilt omzetten:");
        Double GeldAantal = scanner.nextDouble(); //Doubles, strings en integers worden allemaal zo opgeslagen

        System.out.println("Kies een geldtype waar je het naar wilt omzetten:");
        System.out.println("1. Euro");
        System.out.println("2. Dollar");
        System.out.println("3. Pond");
        int GeldOut = scanner.nextInt();
        switch (GeldIn){
            case 1:
                switch (GeldOut) {
                    case 1:
                        System.out.println(GeldAantal / 1);
                        break;
                    case 2:
                        System.out.println(GeldAantal * 1.16);
                        break;
                    case 3:
                        System.out.println(GeldAantal / 0.88);

                }
            
            break;

            case 2:
                switch (GeldOut) {
                    case 1:
                        System.out.println(GeldAantal * 0.86);
                        break;
                    case 2:
                        System.out.println(GeldAantal * 1);
                        break;
                    case 3:
                        System.out.println(GeldAantal / 0.76);

                }
                break;
            case 3:
                switch (GeldOut) {
                    case 1:
                        System.out.println(GeldAantal * 1.31);
                        break;
                    case 2:
                        System.out.println(GeldAantal * 1.16);
                        break;
                    case 3:
                        System.out.println(GeldAantal / 1);

                }
                break;
        }


    }
}
