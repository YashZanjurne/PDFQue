import java.util.Scanner; // Import Scanner class

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0); // Read character input

        // Check if character is an alphabet (A-Z or a-z)
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet.");
        }
        // Check if character is a digit (0-9)
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        }
        // If neither alphabet nor digit, it's a special symbol
        else {
            System.out.println(ch + " is a Special Symbol.");
        }

        sc.close(); // Close scanner
    }
}

