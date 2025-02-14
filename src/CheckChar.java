/* Q3. Write program to create class name as CheckChar with two functions
 void setChar(char ch): this function accept single character as input
 boolean checkChar(): this function can check character is alphabet or digit of special symbol if
character is alphabet or digit return true if character is digit then return false. */




import java.util.Scanner;

public class CheckChar {
    char ch ;
    void setChar(char ch){
        this.ch=ch;
    }
    boolean checkChar() {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is a symbol or digit.");
        }


        return false;
    }

        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value");
            char inputChar = sc.next().charAt(0);

            CheckChar c = new CheckChar();
            c.setChar(inputChar);
            c.checkChar();

    }
}
