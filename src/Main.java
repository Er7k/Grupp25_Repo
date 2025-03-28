import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EriksKlass eriksKlass = new EriksKlass();
        Frida frida = new Frida();
        Lovisa lovisa = new Lovisa();
        simon simon = new simon();


        while (true) {
            System.out.println("Skriv ett nummer: 1 = Erik 2 = Frida 3 = Lovisa 4 = Simon");
            Scanner scanner = new Scanner(System.in);

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                eriksKlass.printErik();
            } else if (choice == 2) {
                frida.Frida();
            } else if (choice == 3) {
                lovisa.hello();
            } else if (choice == 4) {
                simon.hello();
            }
        }
    }
}