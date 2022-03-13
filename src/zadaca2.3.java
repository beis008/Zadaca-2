import java.util.Scanner;

public class zadaca2zad3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Koliko brojeva zelite u vasem nizu?");
        int brojElemenata = reader.nextInt();
        int[] datiNiz = new int[brojElemenata];
        System.out.println("Please enter " + brojElemenata + " integer elements: ");
        for (int i = 0; i < datiNiz.length; i++) {
            datiNiz[i] = reader.nextInt();
        }
        System.out.println("Normalni broj niza: ");
        for (int i = 0; i < datiNiz.length; i++) {
            System.out.print(datiNiz[i] + " ");
        }
        System.out.println("\n Obrnuti broj niza: ");
        for (int j = datiNiz.length - 1; j >= 0; j--) {
            System.out.print(datiNiz[j] + " ");
        }
    }
}
