import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pyta użytkownika o kwotę zakupu
        System.out.print("Podaj kwotę zakupu: ");
        double kwotaZakupu = scanner.nextDouble();

        // Pyta użytkownika czy jest uczyniem
        System.out.print("Czy jesteś uczniem? (tak lub nie): ");
        String czyUczen = scanner.next();

        double kwotaDoZaplaty;

        if(czyUczen.equalsIgnoreCase("tak")){ // Jeśli odpowiedź to tak
            kwotaDoZaplaty = kwotaZakupu * 0.9; // Dodanie 10 % rabatu
        } 
        else{
            kwotaDoZaplaty = kwotaZakupu; // Kwota bez zmiany
        }
        // Wyświetlenie ostatecznej kwoty
        System.out.println("Kwota do zapłaty: " + kwotaDoZaplaty);

        scanner.close();
    }
}