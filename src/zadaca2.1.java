import java.util.Scanner;

public class zadaca2zad1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Koliko nizova zelite?");
        int numberLength = reader.nextInt();
        int[] datiNiz = new int[numberLength];
        int brojic = 0;
        for (int i = 0; i < datiNiz.length; i++) {
            System.out.println("Unesi integrisani broj " + ++brojic);
            datiNiz[i] = reader.nextInt();
        }
        System.out.println("Uneseni brojevi su:");
        for (int j : datiNiz) {
            if (j % 2 == 0) {
                if (j > 10) {
                    System.out.println(j + " dijeljiv je sa 2 i veci je od 10 :D");
                } else if (j < 10) {
                    System.out.println(j + " dijeljiv je sa 2 i manji je od 10 :D");
                }
            } else {
                if (j > 10) {
                    System.out.println(j + " nije dijeljiv sa 2 i veci je od 10 :/");
                } else if (j < 10) {
                    System.out.println(j + " nije dijeljiv sa 2 i manji je od 10 :( ");
                }
            }
        }
    }
}