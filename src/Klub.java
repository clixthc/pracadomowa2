import java.util.Scanner;

public class Klub {
    public static void main(String[] args) {
        System.out.println("Jak masz na imie?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Czesc " + name +" Milo Cie poznac. Ile masz lat?");
        int age = scanner.nextInt();
            if (age >= 21) {
                System.out.println("Mozesz wejsc, zapraszamy");
            } else {
                if (age < 21)
                    System.out.println("Nie mozesz wejsc, jestes zbyt mlody");
            }



    }
}
