import java.util.Scanner;

public class zadaca2zad7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Upisite date elemente:");
        int brojElemenata = reader.nextInt();
        String[] datNiz = new String[brojElemenata+1];
        System.out.println("Upisi " + brojElemenata);
        for (int i = 0; i<datNiz.length; i++) {
            datNiz[i] = reader.nextLine();
        }
        System.out.println("Samoglasnici u ovom elementu: ");
        for (int i = 0; i<datNiz.length; i++) {
            if(datNiz[i].toLowerCase().contains("a") || datNiz[i].toLowerCase().contains("e") || datNiz[i].toLowerCase().contains("i") || datNiz[i].toLowerCase().contains("o") || datNiz[i].toLowerCase().contains("u") ){
                System.out.print(datNiz[i] + " ");
            }
        }
    }
}
