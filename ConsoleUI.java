import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner;

    public ConsoleUI(Scanner scanner) {
        this.scanner = scanner;
    }

    public String prompt(String label) {
        System.out.print(label);
        return scanner.nextLine();
    }

    public int promptInt(String label) {
        System.out.print(label);
        int value = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        return value;
    }

    public void print(String message) {
        System.out.println(message);
    }
}