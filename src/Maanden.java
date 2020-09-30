import java.util.Scanner;

public class Maanden {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("We gaan kijken welke maand bij een getal hoort.");
        var maandnummer = 0;
        do {
        System.out.print("Kies een getal van 1 tot en met 12: ");
        var s = new Scanner(System.in);
        maandnummer = s.nextInt();

            switch (maandnummer) {
                case 1:
                    System.out.println("Januari is de eerste maand.");
                    break;
                case 2:
                    System.out.println("Februari is de tweede maand.");
                    break;
                case 3:
                    System.out.println("Maart is de derde maand.");
                    break;
                case 4:
                    System.out.println("April is de vierde maand.");
                    break;
                case 5:
                    System.out.println("Mei is de vijfde maand.");
                    break;
                case 6:
                    System.out.println("Juni is de zesde maand.");
                    break;
                case 7:
                    System.out.println("Juli is de zevende maand.");
                    break;
                case 8:
                    System.out.println("Augustus is de achtste maand.");
                    break;
                case 9:
                    System.out.println("September is de negende maand.");
                    break;
                case 10:
                    System.out.println("Oktober is de tiende maand.");
                    break;
                case 11:
                    System.out.println("November is de elfde maand.");
                    break;
                case 12:
                    System.out.println("December is de twaalfde maand.");
                    break;
                default:
                    System.out.println("Een jaar heeft slechts twaalf maanden!..");
                    System.out.println();
            }
        } while (maandnummer > 12);

    }
}
