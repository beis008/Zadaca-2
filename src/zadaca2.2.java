import java.util.Scanner;

public class zadaca2zad2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Koliko brojeva zelite u nizu? (mogu samo brojevi od 1 do 15)");
        int broj = reader.nextInt();
        String[] imeBrojeva = {"Prvi", "Drugi", "Treci", "Cetvrti", "Peti", "Sesti", "Sedmi", "Osmi", "Deveti", "Deseti", "Jedanaesti", "Dvanaesti", "Trinaesti", "Cetrnaesti", "Petnaesti"};
        int[] datiNiz = new int[broj];

        int a = 0;
        for (int i = 0; i < datiNiz.length; i++) {
            System.out.println("Unesi broj integrisanog broja " + ++a);
            datiNiz[i] = reader.nextInt();
        }
        System.out.println("Dati brojevi u nizu: ");
        for (int j = 0; j < datiNiz.length; j++) {
            System.out.println(imeBrojeva[j] + " broj u nizu: " + datiNiz[j]);
        }
    }
}
