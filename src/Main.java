import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int size = 10;

        // Print the top header row
        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n--------------------------------------------------");

        // Nested loops for rows and columns
        for (int i = 1; i <= size; i++) {
            // Print the row header
            System.out.printf("%4d |", i);

            // Print each column in the row
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        };
    }
}