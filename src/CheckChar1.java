/* Q3. Write program to create class name as CheckChar with two functions
 void setChar(char ch): this function accept single character as input
 boolean checkChar(): this function can check character is alphabet or digit of special symbol if
character is alphabet or digit return true if character is digit then return false.*/

public class CheckChar1 {
    char ch;
    void setChar(char ch){
        this.ch=ch;
    }
    boolean checkChar() {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true; // Alphabet
        } else if (ch >= '0' && ch <= '9') {
            return false; // Digit
        } else {
            return false; // Special Symbol
        }
    }

    public static void main(String[] args) {
        CheckChar ck = new CheckChar();
        ck.setChar('a'); // Corrected character input
        System.out.println(ck.checkChar());
    }
}
