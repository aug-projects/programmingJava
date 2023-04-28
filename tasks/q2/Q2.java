import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the statement: ");
        String statement = scanner.nextLine();

        int countSpaces = 0;
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == ' ') {
                countSpaces++;
            }
        }

        System.out.println("The number of spaces in the statement is " + countSpaces + ".");
    }
}
