import java.util.Scanner;

public class zadaca2zad5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Napisi manji broj u nizu: ");
        int nizi = reader.nextInt();
        System.out.println("Napisi veci broj u nizu: ");
        int visi = reader.nextInt();
        System.out.println("Parni brojevi od " + nizi + " do " + visi + " su: ");
        for (int i = nizi + 1; i < visi; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
